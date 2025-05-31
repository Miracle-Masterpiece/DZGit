import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Введите число: ");
                long value = scanner.nextLong();
                System.out.println("Вы ввели: " + value);
                break;
            } catch (InputMismatchException inputExept) {
                System.out.print("Введённая строка не является числом, повторите попытку\n");
                scanner.nextLine();
            }
        } while (true);



    }
}
