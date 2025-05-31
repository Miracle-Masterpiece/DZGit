import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Random rand = new Random(0xff);
        for (int i = 0; i < 180; ++i) {
            company.hire(new Operator(rand.nextInt(5000) + 40_000));
        }

        for (int i = 0; i < 80; ++i) {
            company.hire(new Manager(rand.nextInt(5000) + 100_000));
        }

        for (int i = 0; i < 10; ++i) {
            company.hire(new TopManager(company, rand.nextInt(5000) + 120_000));
        }

        System.out.println("Топ 15 зарплат:");
        for (Employee e : company.getTopSalaryStaff(15)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        System.out.println("\n30 самых низких зарплат:");
        for (Employee e : company.getLowestSalaryStaff(30)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        List<Employee> all = company.getEmployees();
        for (int i = 0; i < all.size() / 2; i++) {  //Увольнение 50% сотрудников
            company.fire(all.get(i));
        }

        System.out.println("\nТоп 15 зарплат после увольнения:");
        for (Employee e : company.getTopSalaryStaff(15)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

        System.out.println("\n30 самых низких зарплат после увольнения:");
        for (Employee e : company.getLowestSalaryStaff(30)) {
            System.out.println(e.getMonthSalary() + " руб.");
        }

    }
}