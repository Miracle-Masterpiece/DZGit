import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Напишите метод, который принимает на вход два множества Set и возвращает новое множество, содержащее все элементы из обоих исходных множеств.
 */
public class Task2 {

    public static <T> Set<T> merge(Set<T> x, Set<T> y) {
        Set<T> result = new HashSet<>();
        result.addAll(x);
        result.addAll(y);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> first  = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> second = new HashSet<>(Arrays.asList(5, 6, 7, 8));
        Set<Integer> union = merge(first, second);
        System.out.println(union);
    }
}
