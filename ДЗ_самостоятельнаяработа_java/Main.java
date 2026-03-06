public class Main {

    public static void main(String[] args) {

        Company company = new Company();

        Developer dev1 = new Developer("Alex", 2500, "Java");
        Developer dev2 = new Developer("John", 1800, "Python");

        Manager manager = new Manager("Sarah", 3200, 5);

        Designer designer = new Designer("Mike", 2100, "Figma");

        company.addEmployee(dev1);
        company.addEmployee(dev2);
        company.addEmployee(manager);
        company.addEmployee(designer);

        System.out.println("----- All Employees -----");
        company.showAll();

        System.out.println("\n----- Work Day -----");
        company.startWorkDay();

        System.out.println("\nTotal Salary: " + company.totalSalary());

        System.out.println("\n----- Salary > 2000 -----");
        company.showHighSalary(2000);
    }
}
