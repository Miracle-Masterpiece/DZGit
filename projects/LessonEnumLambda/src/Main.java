import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public enum Operation {
        SUM,
        DIFFERENT,
        MULTIPLY,
        DIVIDE
    };

    public static double calculate(double a, double b, Operation operation) {
        return switch (operation) {
            case SUM        -> a + b;
            case DIFFERENT  -> a - b;
            case MULTIPLY   -> a * b;
            case DIVIDE     -> a / b;
        };
    }

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "lime", "lemon", "mango");
        fruits.sort((f1, f2) -> Integer.compare(f1.length(), f2.length()));
        fruits.forEach(System.out::println);
    }

    public static void print(Object o) {
        System.out.println(o);
    }
}