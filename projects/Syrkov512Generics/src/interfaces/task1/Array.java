package interfaces.task1;

import generics.task6.Sort;
import interfaces.task3.ISort;

public class Array implements IShow, ISort {

    private int[] data;

    public Array(int length) {
        data = new int[length];
    }

    public Array(int[] array) {
        data = array;
    }

    int get(int idx) {
        return data[idx];
    }

    void set(int idx, int value) {
        data[idx] = value;
    }

    int getLength() {
        return data != null ? data.length : 0;
    }

    @Override
    public void print() {
        if (data == null) {
            System.out.println("null");
            return;
        }

        for (int i = 0, len = data.length; i < len; ++i) {
            System.out.print(data[i]);
            if (i + 1 != len)
                System.out.print(", ");
        }
    }

    @Override
    public void print(String info) {
        if (data != null) {
            System.out.print(info);
            print();
        }
    }

    @Override
    public void sortAsk() {
        Sort.sort(data, false);
    }

    @Override
    public void sortDesk() {
        Sort.sort(data, true);
    }
}
