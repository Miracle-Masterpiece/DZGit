package task3;

public class Science extends Subject {

    public Science(String subjectName, String teacherName) {
        super(subjectName, teacherName);
    }

    @Override
    public void study() {
        System.out.println("Изучение науковедения...");
    }
}
