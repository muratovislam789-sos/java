public class Developer extends Employee {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if (language != null && !language.isEmpty()) {
            this.language = language;
        } else {
            System.out.println("error: language is empty");
        }
    }

    @Override
    public void info() {
        System.out.println("developer: " + getName() + ", salary: " + getSalary() + ", language: " + language);
    }

    @Override
    public void work() {
        System.out.println("developer writes code");
    }
}
