package Generics;

import java.util.Arrays;
import java.util.List;

public class Main {
    /**
     * Generics - параметризованный тип данных, позволяющий работать с разными типами.
     * Параметр не может быть примитивом.
     * 1. Обобщённый класс - позволяет создавать классы, работающие с разными типами данных.
     * 2. Обобщённые методы - могут быть параметризованы, даже если сам класс нет.
     * 3. Ограничение шаблонов (super или extends)
     *
     * <? extends T> (верхняя граница) - принимает T и его подклассы.
     * <? super T> (нижняя граница) - принимает T и его суперклассы
     *
     * 4. Whildcards - позволяет работать с неизвестными типами.
     * <?>
     */

    public static double sum(List<? extends Number> list) {
        double result = 0;
        for (Number n : list)
            result += n.doubleValue();
        return result;
    }

    public static <T> void reverceArray(T[] a) {
        int len     = a.length;
        int halfLen = a.length >> 1;
        for (int i = 0; i < halfLen; ++i) {
            T tmp = a[i];
            a[i] = a[len - i - 1];
            a[len - i - 1] = tmp;
        }
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(15);
    }

    public static void printList(List<?> list) {
        for (Object n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Number> numbers = List.of(1, 2.8, 3, 4, 5);

        Integer[] a = new Integer[3];
        concat(a);


        String[] b = new String[4];
        concat(b);
    }

    public static <T> void concat(T[] array) {
        if(array instanceof Number[]) {
            System.out.println("num");
        } else if (array instanceof String[]) {
            System.out.println("str");
        } else {

        }
    }


}
