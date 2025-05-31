import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Поиск пары чисел с заданной суммой:
 * Дан массив целых чисел nums и целочисленное значение targetSum.
 * Необходимо найти и вернуть индексы двух чисел в массиве, сумма которых равна targetSum.
 * Предполагается, что в решении существует только одна пара чисел с заданной суммой.
 *
 * Пример:
 * plaintext
 * Input: nums = [2, 7, 11, 15], targetSum = 9
 * Output: [0, 1] (или [1, 0])
 *
 * Подход к решению:
 * Создайте пустой HashSet для хранения значений.
 * Пройдите по каждому числу num в массиве nums.
 * Для каждого числа num, проверьте, присутствует ли targetSum - num в HashSet:
 * Если да, то это означает, что найдена пара чисел с заданной суммой. Верните индексы текущего числа и числа targetSum - num.
 * Если нет, добавьте num в HashSet.
 * Если после завершения прохода по массиву не найдена ни одна пара чисел, верните пустой массив или значение null.
 */
public class Main {

    public static int[] findDoubleSum(int[] a, int targetSum) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; ++i) {
            int diff = targetSum - a[i];
            if (set.contains(diff)) {
                int idx = -1;
                for (int j = 0; j < a.length; ++j) {
                    if (a[j] == diff) {
                        idx = j;
                        break;
                    }

                }
                return new int[] {idx, i};
            } else {
                set.add(a[i]);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Индексы для 6: " + Arrays.toString(findDoubleSum(array, 6)));
        System.out.println("Индексы для 9: " + Arrays.toString(findDoubleSum(array, 9)));
        System.out.println("Индексы для 3: " + Arrays.toString(findDoubleSum(array, 3)));
    }
}