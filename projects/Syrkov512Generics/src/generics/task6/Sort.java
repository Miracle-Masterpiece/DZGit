package generics.task6;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    public static void sort(int[] a, boolean decreasing) {
        if (a == null || a.length < 2)
            return;
        final int len = a.length;
        for (int i = 1; i < len; ++i) {
            int j = i;
            while (j > 0) {
                if (decreasing) {
                    if (a[j] > a[j-1]) {
                        int tmp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = tmp;
                        --j;
                        continue;
                    }
                } else {
                    if (a[j] < a[j-1]) {
                        int tmp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = tmp;
                        --j;
                        continue;
                    }
                }
                break;
            }
        }
    }

    public static <T> void sort(T[] a, Comparator<T> comparator) {
        if (a == null || a.length < 2)
            return;
        final int len = a.length;
        for (int i = 1; i < len; ++i) {
            int j = i;
            while (j > 0) {
                if (comparator.compare(a[j], a[j-1]) < 0) {
                    T tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                    --j;
                    continue;
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] ints = new Integer[]{3, 6, 3, 1, 0, -1, 3, 2, 7, 8, 5, 3, -10};
        System.out.println(Arrays.toString(ints));

        sort(ints, (o1, o2) -> {
            if (o1 < o2) return -1;
            if (o1 > o2) return  1;
            return 0;
        });

        System.out.println(Arrays.toString(ints));
    }

}
