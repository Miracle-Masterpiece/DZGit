public class MyException extends Exception {

    public MyException() {
        this("Моё исключение");
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
