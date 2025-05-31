import java.util.*;

public class Main {

    /**
     * @return
     *      Неконстантный ArrayList<T>();
     */
    public static <T> List<T> asList(T... vargs) {
        List<T> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, vargs);
        return arrayList;
    }

    public static void find(HashMap<String, List<String>> dictionary, Scanner scanner) {
        String inWord = scanner.nextLine().toLowerCase();
        if (dictionary.containsKey(inWord)) {
            System.out.println("[En] " + inWord + " == [Ru] " + dictionary.get(inWord));
            return;
        } else {
            for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                for (String s : entry.getValue()) {
                    if (s.equals(inWord)) {
                        System.out.println("[Ru] " + inWord + " == [En] " + entry.getKey());
                        return;
                    }
                }
            }
        }
        System.out.println("Для слова \'" + inWord + "\' перевода не существует");
    }

    public static void add(HashMap<String, List<String>> dictionary, Scanner scanner) {
        System.out.println("Введите слово на английском: ");
        String finded = scanner.nextLine().toLowerCase();
        System.out.println("Введите слово на русском: ");
        String newWord = scanner.nextLine().toLowerCase();
        if (dictionary.containsKey(finded)) {
            dictionary.get(finded).add(newWord);
        } else {
            dictionary.put(finded, asList(newWord));
        }
        System.out.println("Слово было успешно добавлено.");
    }

    public static void update(HashMap<String, List<String>> dictionary, Scanner scanner) {
        System.out.println("Введите слово которое необходимо заменить: ");
        String find = scanner.nextLine().toLowerCase();
        System.out.println("Введите слово на которое необходимо заменить: ");
        String replaced = scanner.nextLine().toLowerCase();

        if (dictionary.containsKey(find)) {
            List<String> translatedWords = dictionary.get(find);
            dictionary.remove(find);
            dictionary.put(replaced, translatedWords);
            System.out.println("Слово было успешно обновлено.");
            return;
        } else {
            for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                List<String> translatedWords = entry.getValue();
                for (int i = 0; i < translatedWords.size(); ++i) {
                    if (translatedWords.get(i).equals(find)) {
                        translatedWords.remove(i--);
                        translatedWords.add(replaced);
                        System.out.println("Слово было успешно обновлено.");
                        return;
                    }
                }
            }
        }
        System.out.println("Слово \'" + find + "\' не было заменено, поскольку отсутствует в словаре!\nЧтобы добавить его, выберете соответсвующий пунт в меню.");
    }

    public static void remove(HashMap<String, List<String>> dictionary, Scanner scanner) {
        System.out.println("Введите слово которое необходимо удалить: ");
        String find = scanner.nextLine().toLowerCase();

        if (dictionary.remove(find) != null) {
            System.out.println("Слово было успешно удалено.");
            return;
        } else {
            for (Map.Entry<String, List<String>> entry : dictionary.entrySet()) {
                List<String> translatedWords = entry.getValue();
                for (int i = 0; i < translatedWords.size(); ++i) {
                    if (translatedWords.get(i).equals(find)) {
                        translatedWords.remove(i--);
                        System.out.println("Слово было успешно удалено.");
                        return;
                    }
                }
            }
        }
        System.out.println("Слово \'" + find + "\' не было удалено, поскольку отсутствует в словаре!\n");
    }

    public static void main(String[] args) {
        HashMap<String, List<String>> dictionary = new HashMap<>();
        dictionary.put("dog",       asList("собака"));
        dictionary.put("brother",   asList("брат"));
        dictionary.put("mother",    asList("мать","мама"));
        dictionary.put("father",    asList("отец","папа"));
        dictionary.put("home",      asList("дом"));

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.print("0 Выход\n1 Найти слово\n2 Добавить слово\n3 Заменить слово\n4 Удалить слово\nВведите операцию: ");
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                find(dictionary, scanner);
            } else if (input == 2) {
                add(dictionary, scanner);
            } else if (input == 3) {
                update(dictionary, scanner);
            } else if (input == 4) {
                remove(dictionary, scanner);
            }

            System.out.println("\n\n");
        } while(input != 0);

    }
}