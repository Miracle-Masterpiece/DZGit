/**
 * Задача 3: Поиск заданного элемента в массиве
 * Предоставлен массив чисел и значение, которое нужно найти.
 * Ваша задача - определить, содержит ли массив заданное значение, и если да, то найти индекс этого значения в массиве.
 */
public class Task3 {

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 2, 4, 1, 7, -1, -3, 5, 9};

        int idx = search(array, 6);
        if (idx != -1) {
            System.out.println("Массив содержит 6 по индексу " + idx);
        } else {
            System.out.println("Массив не содержит 6");
        }

        idx = search(array, -1);
        if (idx != -1) {
            System.out.println("Массив содержит -1 по индексу " + idx);
        } else {
            System.out.println("Массив не содержит -1");
        }

        idx = search(array, 9);
        if (idx != -1) {
            System.out.println("Массив содержит 9 по индексу " + idx);
        } else {
            System.out.println("Массив не содержит 9");
        }

    }

}
