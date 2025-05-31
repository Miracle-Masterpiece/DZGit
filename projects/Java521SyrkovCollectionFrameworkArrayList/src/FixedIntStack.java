import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class FixedIntStack {

    int[] elements;
    int top;

    FixedIntStack(int max) {
        elements = new int[max];
        top      = -1;
    }

    public void push(int value) {
        if (top + 1 >= elements.length)
            throw new BufferOverflowException();
        elements[++top] = value;
    }

    public int pop() {
        if (top == -1)
            throw new NoSuchElementException();
        int value = elements[top];
        --top;
        return value;
    }

    public int getTop() {
        if (top == -1)
            throw new NoSuchElementException();
        return elements[top];
    }

    public void clear() {
        if (top > 0) {
            Arrays.fill(elements, 0);
            top = -1;
        }
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        FixedIntStack stack = new FixedIntStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Top: " + stack.getTop());

        System.out.println("Pop:" + stack.pop());
        System.out.println("Pop:" + stack.pop());
    }

}
