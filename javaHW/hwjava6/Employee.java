public class Employee {

    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("error: name is empty");
        }
    }

    public double getSalary() {
        return salary;
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
        System.out.println("employee is working");
    }

    // дополнительное задание
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
}