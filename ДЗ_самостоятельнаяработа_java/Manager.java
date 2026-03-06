public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() + " manages a team of " + teamSize + " people");
    }

    @Override
    public void info() {
        System.out.println("Manager | Name: " + getName() +
                " | Salary: " + getSalary() +
                " | Team size: " + teamSize);
    }
}
