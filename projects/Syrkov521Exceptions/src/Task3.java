import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задача 3*. Подсчет факториала
 * Напишите программу, которая запрашивает у пользователя целое число и вычисляет его факториал. Факториал числа nn (обозначается n!n!) - это произведение всех целых чисел от 1 до nn. Например, 5!=5×4×3×2×1=1205!=5×4×3×2×1=120.
 * Однако, для решения этой задачи предусмотрите возможность ввода отрицательных чисел. В случае, если пользователь ввел отрицательное число, выбросьте специальное исключение NegativeNumberException, а затем обработайте его, выводя сообщение об ошибке. Вот отдельный класс ошибки, который также необходимо создать.
 * class NegativeNumberException extends Exception {
 *     public NegativeNumberException(String message) {
 *         super(message);
 *     }
 * }
 */
public class Task3 {

    public static int getFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return getFactorial(n - 1) * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            try {
                System.out.print("Введите число: ");
                n = scanner.nextInt();
                if (n < 0)
                    throw new NegativeNumberException("Value must be >= 0");
                System.out.printf("%d! == %d", n, getFactorial(n));
                break;
            } catch (InputMismatchException inputExcept) {
                System.out.println("Ввод не является числом! Повторите попытку.");
                scanner.nextLine();
            } catch (NegativeNumberException negateExcept) {
                System.out.println("Число должно быть положительным! Повторите попытку.");
            }
        } while (true);
    }
}
