package inheritance;

//POJO - class
//Обычный класс с классическим конструктором и геттерами и сеттерами
public class Person {

    private String  langProgram;
    private String  name;
    private int     age;

    private static int totalCreatedObjects;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        ++totalCreatedObjects;
    }

    public static int getTotalCreatedObjects() {
        return totalCreatedObjects;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    protected void speak() {
        System.out.println("Привет, я " + name);
    }

    protected void walk() {

    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
