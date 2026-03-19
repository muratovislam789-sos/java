public class Manager extends Employee {

    private int teamSize;

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            System.out.println("error: team size < 0");
        }
    }

    @Override
    public void info() {
        System.out.println("manager: " + getName() + ", salary: " + getSalary() + ", team: " + teamSize);
    }

    @Override
    public void work() {
        System.out.println("manager manages team");
    }
}
