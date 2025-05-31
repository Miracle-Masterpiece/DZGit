import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Stack<E> {

    private List<E> list;

    Stack() {
        list = new LinkedList<>();
    }

    public boolean push(E e) {
        list.add(e);
        return true;
    }

    public E pop() {
        return list.removeLast();
    }

    public E get() {
        return list.getLast();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e : list) {
            sb.append(e).append(' ');
        }
        return sb.toString();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; ++i) {
            stack.push(i);
        }

        System.out.println("size(): " + stack.getSize());
        System.out.println("toString(): " +  stack.toString());


        System.out.println("isEmpty(): " + stack.isEmpty());
        System.out.println();

        System.out.println("pop elements");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\nsize(): " + stack.getSize());
        System.out.println("isEmpty(): " + stack.isEmpty());
    }
}
