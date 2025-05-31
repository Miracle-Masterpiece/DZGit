public class TopManager implements Employee{

    private double salary;
    private Company company;

    public TopManager(Company company, double salary) {
        this.salary = salary;
        this.company = company;
    }

    @Override
    public double getMonthSalary() {
        if (company.getIncome() > 10_000_00) {
            return salary * 1.5;
        } else {
            return salary;
        }
    }
}
