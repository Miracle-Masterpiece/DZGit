import java.util.HashSet;
import java.util.Set;

/**
 * Напишите метод, который принимает на вход строку и проверяет, содержит ли она все уникальные символы.
 * Метод должен вернуть true, если все символы в строке уникальны, и false в противном случае.
 */
public class Task1 {

    public static boolean isUnique(String s) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0, len = s.length(); i < len; ++i) {
            if (chars.contains(s.charAt(i)))
                return  false;
            chars.add(s.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        String unique = "abcdefg";
        String notUnique = "abcdefa";
        System.out.println(unique + " is unique == " + isUnique(unique));
        System.out.println(notUnique + " is unique == " + isUnique(notUnique));
    }

}
