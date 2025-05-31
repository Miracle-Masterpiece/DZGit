/**
 *
 * Задача 4*: Проверка правильности формата даты (boolean)
 * Условие: Напишите метод для проверки правильности формата даты в строке (например, "гггг-мм-дд").
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(isDate("2019-60-10"));
        System.out.println(isDate("1997-01-01"));
    }

    public static boolean isDate(String s) {
        return s.matches("\\d+-\\d{1,2}-\\d+");
    }
}
