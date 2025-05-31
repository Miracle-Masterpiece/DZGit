package inheritance;

//extends -
public class Programmer extends Person {

    private String  langProgram;

    //super - ссылка на родительский объект
    public Programmer(String name, int age, String langProgram) {
        super(name, age);
        this.langProgram = langProgram;
    }

    @Override
    public void speak() {
        super.speak();
    }

    public void program(String code) {
        System.out.println("Я запрограммировал(-a) " + code + " с помощью " + langProgram);
    }
}
