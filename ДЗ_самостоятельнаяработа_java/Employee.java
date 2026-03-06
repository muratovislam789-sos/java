public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        if (salary < 0) {
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public void info() {
        System.out.println("Name: " + name + " | Salary: " + salary);
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
