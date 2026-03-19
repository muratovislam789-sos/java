public class Employee {

    private String name;
    private double salary;

    // getter
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // setter с проверками
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("error: name is empty");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("error: salary < 0");
        }
    }

    public void info() {
        System.out.println("name: " + name + ", salary: " + salary);
    }

    public void work() {
        System.out.println("employee works");
    }

    // задание 5 (повышение зарплаты)
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        } else {
            System.out.println("error: raise must be > 0");
        }
    }
}
