import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class LiveCircleGame {
    public static void main(String[] args) {
        LinkedList<String> players = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        HashSet<String> alreadyInputed = new HashSet<>();

        // Заполнение списка участников
        System.out.println("Введите имена участников игры (для завершения введите \"конец\"):");
        String name;
        while (!(name = scanner.nextLine()).equalsIgnoreCase("конец")) {
            players.add(name);
        }

        // Игровой процесс
        System.out.println("Игра начинается!");
        String lastWord = "";

        MAIN_LOOP :
        while (players.size() > 1) {
            String currentPlayer = players.poll(); // Получаем текущего игрока и убираем его из списка
            String inputWord;

            // Просим текущего игрока назвать слово, начинающееся с последней буквы предыдущего слова
            if (lastWord.isEmpty()) {
                System.out.println(currentPlayer + ", назовите слово:");
            } else {
                System.out.println(currentPlayer + ", назовите слово, начинающееся с буквы \"" + lastWord.charAt(lastWord.length() - 1) + "\":");
            }

            // Проверяем правильность введенного слова
            while (true) {
                inputWord = scanner.nextLine().toLowerCase();
                if ((lastWord.isEmpty() || (lastWord.length() > 0 && inputWord.charAt(0) == lastWord.charAt(lastWord.length() - 1)))) {
                    lastWord = inputWord; // Обновляем последнее слово
                    break;
                } else {
                    System.out.println("Неверное слово! " + currentPlayer + " выбывает!");
                    continue MAIN_LOOP;
                }
            }

            if (alreadyInputed.contains(inputWord)) {
                System.out.println("Данный город уже называли, поэтому " + currentPlayer + " выбывает!");
                continue;
            } else {
                alreadyInputed.add(inputWord);
            }

            // Добавляем текущего игрока в конец списка
            players.addLast(currentPlayer);
        }

        // Победитель
        System.out.println("Поздравляем, " + lastWord + " - это последнее слово в игре!");
    }
}
