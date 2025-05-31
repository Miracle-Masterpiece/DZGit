/**
 * Задача 5: Замена всех чисел в строке на символ "X" (String)
 * Условие: Напишите метод для замены всех чисел в строке на символ "X".
 *
 * Было: "There are 3 cats and 2 dogs in the yard."
 * Стало: There are X cats and X dogs in the yard.
 */
public class Task5 {


    public static void main(String[] args) {
        System.out.println(replaceNumbers("There are 3 cats and 2 dogs in the yard.", 'X'));
    }

    public static String replaceNumbers(String s, char ch) {
        return s.replaceAll("\\d+", String.valueOf(ch));
    }

}
