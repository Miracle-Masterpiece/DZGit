import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Задача 2. Парсинг даты:
 * Напишите программу, которая запрашивает у пользователя ввод даты в формате "год-месяц-день" (например, "2022-01-31").
 * Затем попробуйте преобразовать эту строку в объект типа LocalDate с помощью метода LocalDate.parse().
 * Обработайте возможное исключение DateTimeParseException, если введенная строка имеет неверный формат.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = null;
        do {
            date = scanner.nextLine();
            try {
                LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
                System.out.println("Введённая дата: " + ld);
                break;
            } catch (DateTimeParseException exept) {
                System.out.println("Вы ввели неверную дату, повробуйте ещё раз.");
            }
        } while (true);
    }
}
