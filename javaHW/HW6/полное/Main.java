public class Main {

    public static void main(String[] args) {

        Developer dev = new Developer();
        dev.setName("alex");
        dev.setSalary(5000);
        dev.setLanguage("java");

        Designer des = new Designer();
        des.setName("anna");
        des.setSalary(4000);
        des.setTool("figma");

        Manager man = new Manager();
        man.setName("john");
        man.setSalary(6000);
        man.setTeamSize(5);

        // вывод
        dev.info();
        des.info();
        man.info();

        // работа
        dev.work();
        des.work();
        man.work();

        // изменение через setter
        dev.setLanguage("python");
        man.setTeamSize(10);

        // повышение зарплаты
        dev.raiseSalary(1000);
        man.addBonus();

        System.out.println("\nafter changes:");
        dev.info();
        man.info();

        // проверка ошибок
        System.out.println("\nvalidation test:");

        dev.setName("");          // ошибка
        des.setSalary(-100);      // ошибка
        dev.setLanguage("");      // ошибка
        des.setTool("");          // ошибка
        man.setTeamSize(-5);      // ошибка
    }
}
