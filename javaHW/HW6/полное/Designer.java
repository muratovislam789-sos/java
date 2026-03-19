public class Designer extends Employee {

    private String tool;

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        if (tool != null && !tool.isEmpty()) {
            this.tool = tool;
        } else {
            System.out.println("error: tool is empty");
        }
    }

    @Override
    public void info() {
        System.out.println("designer: " + getName() +
                ", salary: " + getSalary() +
                ", tool: " + tool);
    }

    @Override
    public void work() {
        System.out.println("designer creates design");
    }

    // задание 6
    public void addBonus() {
        raiseSalary(300);
    }
}
