package Generics;

public class Box<T> {
    private T content;

    public void setContent(T item) {
        content = item;
    }

    public T getContent() {
        return content;
    }
}
