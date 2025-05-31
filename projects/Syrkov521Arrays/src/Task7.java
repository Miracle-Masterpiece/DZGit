/**
 * Задача 7*:
 * Найти самую длинную строку в массиве строк
 * У вас есть массив строк, и ваша задача - найти самую длинную строку в этом массиве.
 */
public class Task7 {

    public static String findMaxString(String[] array) {
        String result = null;
        for (int i = 0; i < array.length; ++i) {
            if (result == null) {
                result = array[i];
                continue;
            }
            if (result.length() < array[i].length()) {
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[] {"Java", "First", "Hello", "Anything", "int", "void***"};
        String result = findMaxString(strs);
        if (result != null) {
            System.out.println("Строка с максимальной длинной: " + result);
        }
    }

}
