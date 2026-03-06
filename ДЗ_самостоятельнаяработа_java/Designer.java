public class Designer extends Employee {

    private String tool;

    public Designer(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    public void work() {
        System.out.println(getName() + " designs using " + tool);
    }

    @Override
    public void info() {
        System.out.println("Designer | Name: " + getName() +
                " | Salary: " + getSalary() +
                " | Tool: " + tool);
    }
}
