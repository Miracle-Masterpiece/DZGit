import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(FileInputStream scanner = new FileInputStream("text.txt")){

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("After");
    }

    public static void doSomething() throws MyException {
        int[] numbers   = null;
        if (numbers == null)
            throw new MyException("Ошибка в методе doSomething();", new NullPointerException());
    }

}