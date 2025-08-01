package assignment.assignment__11.problem__11;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove book by ISBN
    public void removeBook(String isbn) {
        boolean removed = books.removeIf(book -> book.getIsbn().equals(isbn));
        if (removed)
            System.out.println("Book with ISBN " + isbn + " removed.");
        else
            System.out.println("Book not found.");
    }

    // Search book by title (case-insensitive)
    public void searchBook(String title) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + book);
                found = true;
            }
        }
        if (!found) System.out.println("No book found with title: " + title);
    }

    // Lend book by ISBN
    public void lendBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book lent: " + book.getTitle());
                } else {
                    System.out.println("Book is already lent out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Show all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }
}

