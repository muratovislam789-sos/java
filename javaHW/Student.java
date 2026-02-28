public class Student{
      private String name;
      private int age;
      private double gpa;

      public Student(String name, int age, double gpa){
        this.name = name;

        if(age <= 0) age = 0;
        this.age = age;

        if(gpa < 0) gpa = 0;
        if(gpa > 4.0) gpa = 4.0;
        this.gpa = gpa;
      }
      public Student(String name){
        this(name,0,0.0);
      }

      public void printInfo(){
        System.out.println(name + " (" + age + ") gpa = " + gpa);
      }

}
