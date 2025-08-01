package assignment.assignment__11.problem__11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Sample books
        library.addBook(new Book("The Alchemist", "Paulo Coelho", "123"));
        library.addBook(new Book("1984", "George Orwell", "456"));
        library.addBook(new Book("Clean Code", "Robert Martin", "789"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Lend Book");
            System.out.println("5. Display All Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    library.removeBook(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Enter title to search: ");
                    library.searchBook(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter ISBN to lend: ");
                    library.lendBook(scanner.nextLine());
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 0:
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
