import java.util.Arrays;
import java.util.Random;

/**
 * Задача 4: Найти наименьший элемент в одномерном массиве чисел
 * У вас есть одномерный массив целых чисел.
 * Ваша задача - найти наименьший элемент в этом массиве с использованием цикла foreach.
 */
public class Task4 {

    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int searchMinElement(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array)
            min = min(min, value);
        return  min;
    }

    public static void main(String[] args) {
        int[] array = new int[10];

        {//fill array
            Random rnd = new Random(0x7fff);
            for (int i = 0; i < array.length; ++i)
                array[i] = rnd.nextInt(100);
            System.out.println(Arrays.toString(array));
        }

        int minElement = searchMinElement(array);
        System.out.println("Минимальный элемент равен " + minElement);

    }
}
