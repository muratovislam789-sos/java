public class Developer extends Employee {

    private String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println(getName() + " writes code in " + language);
    }

    @Override
    public void info() {
        System.out.println("Developer | Name: " + getName() +
                " | Salary: " + getSalary() +
                " | Language: " + language);
    }
}
