package assignment.assignment__12.problem__14;
import java.util.*;

class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // toString for display
    public String toString() {
        return "[" + title + " by " + author + " - ₹" + price + "]";
    }
}

public class LibrarySystem {
    // Map of Genre → List of Books
    private static Map<String, List<Book>> library = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books by Genre");
            System.out.println("3. Sort Books in Genre (by price)");
            System.out.println("4. Sort Books in Genre (by title)");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> showBooksByGenre();
                case 3 -> sortBooksByPrice();
                case 4 -> sortBooksByTitle();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author: ");
        String author = scanner.nextLine();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        Book book = new Book(title, author, price);
        library.computeIfAbsent(genre, k -> new ArrayList<>()).add(book);
        System.out.println("Book added.");
    }

    private static void showBooksByGenre() {
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        List<Book> books = library.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre: " + genre);
        } else {
            System.out.println("Books in genre '" + genre + "':");
            books.forEach(System.out::println);
        }
    }

    private static void sortBooksByPrice() {
        System.out.print("Enter genre to sort: ");
        String genre = scanner.nextLine();
        List<Book> books = library.get(genre);
        if (books != null && !books.isEmpty()) {
            books.sort(Comparator.comparingDouble(b -> b.price));
            System.out.println("Sorted by price:");
            books.forEach(System.out::println);
        } else {
            System.out.println("Genre not found or empty.");
        }
    }

    private static void sortBooksByTitle() {
        System.out.print("Enter genre to sort: ");
        String genre = scanner.nextLine();
        List<Book> books = library.get(genre);
        if (books != null && !books.isEmpty()) {
            books.sort(Comparator.comparing(b -> b.title.toLowerCase()));
            System.out.println("Sorted by title:");
            books.forEach(System.out::println);
        } else {
            System.out.println("Genre not found or empty.");
        }
    }
}
