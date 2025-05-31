import java.util.*;

/**
 * Что нужно сделать
 * 1. Создайте класс компании Company, содержащей сотрудников и реализующей методы:
 * ⦁	найм одного сотрудника — hire(Employee employee),
 * ⦁	найм списка сотрудников – hireAll(Collection<Employee> employes),
 * ⦁	увольнение сотрудника – fire(Employee employee),
 * ⦁	получение значения дохода компании – getIncome().
 *
 */
public class Company {
    private List<Employee> employes;

    public Company() {
        this.employes = new ArrayList<>();
    }

    public void hire(Employee employee) {
        this.employes.add(employee);
    }

    public void hireAll(Collection<Employee> employes) {
        this.employes.addAll(employes);
    }

    public boolean fire(Employee employee) {
        return employes.remove(employee);
    }

    public double getIncome() {
        double income = 0;
        for (Employee employee : employes) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                income += manager.getMoneyForCompany();
            }
        }
        return income;
    }

    List<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> result = new ArrayList<>(employes);
        result.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                double a = o1.getMonthSalary();
                double b = o2.getMonthSalary();
                if (a < b) return  1;
                if (a > b) return -1;
                return 0;
            }
        });
        return result.subList(0, count < employes.size() ? count : employes.size());
    }

    List<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> result = new ArrayList<>(employes);
        result.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                double a = o1.getMonthSalary();
                double b = o2.getMonthSalary();
                if (a < b) return -1;
                if (a > b) return  1;
                return 0;
            }
        });
        return result.subList(0, count < employes.size() ? count : employes.size());
    }


    public List<Employee> getEmployees() {
        return this.employes;
    }
}
