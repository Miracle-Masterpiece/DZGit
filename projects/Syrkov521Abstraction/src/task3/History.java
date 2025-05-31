package task3;

public class History extends Subject{

    public History(String subjectName, String teacherName) {
        super(subjectName, teacherName);
    }

    @Override
    public void study() {
        System.out.println("Изучение истории...");
    }
}
