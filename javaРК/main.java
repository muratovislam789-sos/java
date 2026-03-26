import java.util.ArrayList;
import java.util.Scanner;

interface Readable {
    void read();
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() { 
        return title;
    }

    public void displayInfo() {
        System.out.println("Книга: " + title);
    }
}

class PrintedBook extends Book {
    public PrintedBook(String title) {
        super(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("[Печатная книга] Название: " + getTitle());
    }
}

class EBook extends Book implements Readable {
    public EBook(String title) {
        super(title);
    }

    @Override
    public void displayInfo() {
        System.out.println("[Электронная книга] Название: " + getTitle());
    }

    @Override
    public void read() {
        System.out.println("Чтение электронной книги...");
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void showAll() {
        if (books.isEmpty()) {
            System.out.println("Библиотека пуста.");
        } else {
            for (Book b : books) { 
                b.displayInfo(); 
            }
        }
    }

    public void find(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.print("Найдено: ");
                b.displayInfo();
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }

    public void remove(String title) {
        books.removeIf(b -> b.getTitle().equalsIgnoreCase(title));
        System.out.println("Если книга была, она удалена.");
    }
}

public class main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);

      
        myLibrary.addBook(new PrintedBook("Мастер и Маргарита"));
        myLibrary.addBook(new EBook("Java Core"));

        while (true) {
            System.out.println("\nМеню: 1-Все книги, 2-Поиск, 3-Удалить, 0-Выход");
            System.out.print("Выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                myLibrary.showAll();
            } else if (choice == 2) {
                System.out.print("Введите название: ");
                myLibrary.find(scanner.nextLine());
            } else if (choice == 3) {
                System.out.print("Что удалить?: ");
                myLibrary.remove(scanner.nextLine());
            } else if (choice == 0) {
                System.out.println("Пока!");
                break;
            }
        }
    }
}
