public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.setName("Alex");
        dev.setSalary(5000);
        dev.setLanguage("Java");

        Designer des = new Designer();
        des.setName("Anna");
        des.setSalary(4000);
        des.setTool("Figma");

        Manager man = new Manager();
        man.setName("John");
        man.setSalary(6000);
        man.setTeamSize(5);

        dev.info();
        des.info();
        man.info();

        dev.work();
        des.work();
        man.work();

        dev.raiseSalary(500);

        System.out.println("\nafter raise:");
        dev.info();
    }
}