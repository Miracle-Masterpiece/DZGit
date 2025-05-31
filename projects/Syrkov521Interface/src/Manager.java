import java.util.Random;

public class Manager implements Employee {

    private double salary;
    private double moneyForCompany;

    public Manager(double salary) {
        this.salary = salary;
    }

    @Override
    public double getMonthSalary() {
        final double add = moneyForCompany * 0.05;
        return salary + add;
    }

    public double getMoneyForCompany() {
        return new Random().nextInt(140_000 - 115_000) + 115_000;
    }
}
