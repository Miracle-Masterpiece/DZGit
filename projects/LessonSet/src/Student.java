import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {

    private int     ID;
    private String  name;
    private double  grade;

    public Student(int ID, String name, double grade) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static void main(String[] args) {
        Comparator<Student> studentComparator = Comparator.comparing((Student s) -> s.getName()).thenComparingInt(s -> s.getID());
        TreeSet<Student> students = new TreeSet<>(studentComparator);

        students.add(new Student(101, "Валерий", 4.5));
        students.add(new Student(102, "Андрей", 4.5));
        students.add(new Student(103, "Виктор", 4));
        students.add(new Student(104, "Виктор", 4.5));


        for (Student s : students) {
            System.out.println(s);
        }

    }
}
