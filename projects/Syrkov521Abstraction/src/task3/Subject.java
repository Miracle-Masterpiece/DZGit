package task3;

public abstract class Subject {

    private String subjectName;
    private String teacherName;

    public Subject(String subjectName, String teacherName) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public abstract void study();
}
