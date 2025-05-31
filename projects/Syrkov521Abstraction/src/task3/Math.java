package task3;

public class Math extends Subject {
    public Math(String subjectName, String teacherName) {
        super(subjectName, teacherName);
    }

    @Override
    public void study() {
        System.out.println("Изучение математики...");
    }

}
