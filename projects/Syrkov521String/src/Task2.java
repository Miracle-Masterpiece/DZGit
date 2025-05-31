/**
 *
 * Задача 2: Проверка на анаграммы (boolean)
 * Условие: Напишите метод для проверки areAnagrams, принимающего 2 строки, являются ли они анаграммами (имеют одни и те же символы в разном порядке).
 */
public class Task2 {

    public static void main(String[] args) {
        System.out.println(areAnagrams("Стопп", "Посст"));
    }

    public static boolean areAnagrams(String a, String b) {
//        for (int i = 0, len = a.length(); i < len; ++i) {
//            if (b.indexOf(Character.toLowerCase(a.charAt(i))) == -1 &&
//                b.indexOf(Character.toUpperCase(a.charAt(i))) == -1)
//                return false;
//        }
        if (a.length() != b.length())
            return false;
        for (int i = 0, alen = a.length(); i < alen; ++i) {
            char aCh = Character.toLowerCase(a.charAt(i));
            boolean contains = false;
            for (int j = 0, blen = b.length(); j < blen; ++j) {
                if (Character.toLowerCase(b.charAt(j)) == aCh) {
                    contains = true;
                    break;
                }
            }
            if (!contains)
                return false;
        }
        return true;
    }
}
