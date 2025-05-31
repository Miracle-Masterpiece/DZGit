import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    /**
     *
     * Set - коллекция с уникальными элементами.
     * HashSet и TreeSet
     * HashSet - hashCode() + equals()
     * TreeSet - коллекция с уникальными элементами в упорядоченом порядке
     *
     * Методы .contains(), .add(), .clear(), .remove(), .size()
     */

    public static void main(String[] args) {
        TreeSet<Task> todoList = new TreeSet<>();
        System.out.println(todoList.add(new Task("Покормить кота")));
        System.out.println(todoList.add(new Task("Купить молоко")));
        System.out.println(todoList.add(new Task("Купить хлеб")));
        System.out.println(todoList.add(new Task("Купить молоко")));
        System.out.println(todoList.add(new Task("Купить хлеб")));
        System.out.println(todoList.add(new Task("Купить творог")));

        System.out.println(todoList.headSet(new Task("Купить хлеб")));
        System.out.println(todoList.tailSet(new Task("Купить хлеб")));


//        for (Task s : todoList) {
//            System.out.println(s);
//        }
    }
}