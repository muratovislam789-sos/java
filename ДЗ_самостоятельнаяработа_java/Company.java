import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showAll() {
        for (Employee e : employees) {
            e.info();
        }
    }

    public void startWorkDay() {
        for (Employee e : employees) {
            e.work();
        }
    }

    public int totalSalary() {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    public void showHighSalary(int limit) {
        for (Employee e : employees) {
            if (e.getSalary() > limit) {
                e.info();
            }
        }
    }
}
