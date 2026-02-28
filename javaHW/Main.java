import java.util.Scanner;

public class Main {
      public static void main(String[] args){
      
      // Student s1 = new Student();
      // s1.name = "Alex";
      // s1.age = 18;
      // s1.gpa = 3.2;

      // s1.printInfo();
      // s1.study(10);
      // s1.printInfo();
      // s1.birthday();
      // s1.printInfo();

      // Study c1 = new Study();
      // c1.price = 100000;

      // Study c2 = new Study();
      // c2.price = 120000;


      // c1.setCollege("MIT");
      // c2.setCollege("Oxford");
      // c1.info();
      // c2.info();      

      // BankAccount user1 = new BankAccount("Vova", 1000000);
      // BankAccount user2 = new BankAccount("Roman", 2000000);
      // System.out.println(user1.getOwner() + " -> " + user1.getBalance()); 
      // System.out.println(user2.getOwner() + " -> " + user2.getBalance()); 
      // user1.deposit(50000);
      // user2.withdraw(1000000);
      // System.out.println(user1.getOwner() + " -> " + user1.getBalance()); 
      // System.out.println(user2.getOwner() + " -> " + user2.getBalance());
      
      // Products[] arr = new Products[3];
      // arr[0] = new Products("Tea", 500);
      // arr[1] = new Products("Coffee", 800);
      // arr[2] = new Products("Cake", 1200);
      
      // System.out.println(arr[0].getId());
      // System.out.println(arr[0].getName());
      // System.out.println(arr[0].getPrice());
      // for (int i =0; i < arr.length; i++){
      //       arr[i].print();
      // }
      //    for(Products p : arr){
      //       p.print();
      //    }


      Scanner sc = new Scanner(System.in);

      Shop shop = new Shop(10);

      while (true){
            System.out.println();
            System.out.println("1) Add product");
            System.out.println("2) Show catalog");
            System.out.println("3) Find by id");
            System.out.println("3) Remove by id");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) break;

            if(choice == 1){
                  System.out.print("Name:");
                  String name = sc.nextLine();
                  System.out.print("Price: ");
                  int price = sc.nextInt();

                  shop.addProduct(name, price);
            }
            else if(choice == 2){
                  shop.printAll();
            }
            else if (choice == 3){
                  System.out.print("Id: ");
                  int id = sc.nextInt();
                  sc.nextLine();

                  Product p = shop.findById(id);

                  if(p == null){
                        System.out.println("Not found :(");
                  }
                  else{
                        p.print();
                  }
                  
            }
            else{
                  System.out.println("Wrong option");
            }
      }
      System.out.println("Bye");
      sc.close();


      }

      
}

// Создать класс Car: поля brand,fuel, 
// методы drive(km) тратит(fuel)

// Rectangle: w, h, методы area(), perimetre

// Создать класс Book
// поля: title, author, int pages
// Book: pages не может быть отрицательным
// реализовать метод info() где вы показываете фулл инфу о книге
