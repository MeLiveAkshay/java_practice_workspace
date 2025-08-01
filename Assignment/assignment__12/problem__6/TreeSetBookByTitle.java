package assignment.assignment__12.problem__6;

import java.util.*;

// Book class implementing Comparable for sorting by title
class Book implements Comparable<Book> {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Sort by title
    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return title + " - ₹" + price;
    }
}

public class TreeSetBookByTitle {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("Java Basics", 499));
        books.add(new Book("Advanced Java", 899));
        books.add(new Book("Data Structures", 699));
        books.add(new Book("Algorithms", 599));

        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

