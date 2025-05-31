import inheritance.Person;

public class Doctor extends Person  {
    private String specialization;
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public void heal(String ill) {
        System.out.println("Я вылечил(-a) " + ill);
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("Я врач-" + specialization.toLowerCase());
    }
}
