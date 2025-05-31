import java.util.Arrays;
import java.util.Random;

/**
 * Задача 1: Переворот массива:
 *
 * Напишите программу, которая переворачивает массив, так чтобы последний элемент стал первым,
 * предпоследний - вторым и так далее. Используйте Random для заполнения массива.
 *
 * Вывести свои было и стало.
 *
 * Пример было:
 * [5, 4, 3, 2, 1]
 * Стало:
 * [1, 2, 3, 4, 5]
 */
public class Task1 {

    private static void swap(int[] arr, int idxA, int idxB) {
        int tmp     = arr[idxA];
        arr[idxA]   = arr[idxB];
        arr[idxB]   = tmp;
    }

    public static void flipArray(int[] arr) {
        final int length        = arr.length;
        final int halfLength    = length >> 1;
        for (int i = 0, len = halfLength; i < len; ++i) {
            swap(arr, i, length - i - 1);
        }
    }

    public static void main(String[] args) {
        Random rand = new Random(65535);
        int[] array = new int[10];
        for (int i = 0; i < array.length; ++i)
            array[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(array));
        flipArray(array);
    }

}
