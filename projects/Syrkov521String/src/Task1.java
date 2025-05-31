/**
 * Задача 1: Перевернуть строку (String)
 * Условие: Напишите метод для переворота строки задом наперед с помощью массива символов.
 */
public class Task1 {


    public static void main(String[] args) {
        String original = reverse("Hello, World!");
        System.out.println(original);
    }

    public static String reverse(String in) {
        char[] chars = in.toCharArray();
        final int length = chars.length;
        for (int i = 0, len = length >> 1; i < len; ++i) {
            final int fIdx = i;
            final int sIdx = length - i - 1;
            char tmp = chars[fIdx];
            char a = chars[sIdx];
            chars[fIdx] = a;
            chars[sIdx] = tmp;
        }
        return String.copyValueOf(chars);
    }

}
