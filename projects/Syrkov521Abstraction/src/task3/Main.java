package task3;

public class Main {

    public static void subjectTest(Subject subject) {
        subject.study();
    }

    public static void main(String[] args) {
        subjectTest(new Math("Математика", "Ольга Николаевна"));
        subjectTest(new History("История", "Ольга Анатольевна"));
        subjectTest(new Science("Науковедение", "Елена Владимировна"));
    }
}
