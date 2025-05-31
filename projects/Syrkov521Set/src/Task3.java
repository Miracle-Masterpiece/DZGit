import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Напишите метод, который принимает на вход два множества Set и возвращает новое множество,
 * содержащее только те элементы, которые присутствуют в обоих исходных множествах.
 */
public class Task3 {
    public static <T> Set<T> merge(Set<T> x, Set<T> y) {
        Set<T> result = new HashSet<>(x);
        result.retainAll(y);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> first  = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> second = new HashSet<>(Arrays.asList(5, 3, 7, 2));
        Set<Integer> result = merge(first, second);
        System.out.println(result);
    }
}
