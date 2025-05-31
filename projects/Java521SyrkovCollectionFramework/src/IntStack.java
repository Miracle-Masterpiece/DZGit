import java.nio.BufferOverflowException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class IntStack {

    int[] elements;
    int top;

    IntStack(int max) {
        elements = new int[max];
        top      = -1;
    }

    public void push(int value) {
        if (top + 1 >= elements.length) {
            elements = Arrays.copyOf(elements, (int) (elements.length * 1.5));
        }
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; ++i) {
            sb.append(elements[i]).append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntStack stack = new IntStack(4);
        for (int i = 0; i < 100; ++i)
            stack.push(i);

        System.out.println(stack);

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
    }

}
