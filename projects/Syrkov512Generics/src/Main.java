import generics.task6.Sort;
import interfaces.task1.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(new int[] {3, 6, 23, 6235, 735, 2, 1, 4});
        array.sortDesk();
        array.print("Array: ");
    }
}