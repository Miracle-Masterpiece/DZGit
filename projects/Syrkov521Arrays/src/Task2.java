/**
 * Задача 2: Поиск дубликатов в массиве:
 * Вам предоставляется массив элементов, и ваша задача - определить, есть ли дубликаты (повторяющиеся элементы) в массиве.
 * Если есть, выведите информацию о том, какие элементы являются дубликатами и их индексы.
 */
public class Task2 {

    private static boolean containsDuplicate(int[] array, int idx) {
        int searched = array[idx];
        for (int i = idx + 1; i < array.length; ++i) {
            if (array[i] == searched) {
                return true;
            }
        }
        return false;
    }

    public static void printDuplicateInfo(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            boolean containsDuplicate = containsDuplicate(array, i);
            if (containsDuplicate) {
                System.out.printf("Duplicate %d on index %d\n", array[i], i);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 8, 3, 6, 3, 1, 4, 5, 6, 7, 8, 9};
        printDuplicateInfo(array);
    }
}
