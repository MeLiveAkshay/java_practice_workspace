package assignment.assignment__12.problem__6;

import java.util.*;

class Book {
    String title;
    double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " - ₹" + price;
    }
}

public class TreeSetBookByPrice {
    public static void main(String[] args) {
        TreeSet<Book> booksByPrice = new TreeSet<>(new Comparator<Book>() {
            public int compare(Book b1, Book b2) {
                return Double.compare(b1.price, b2.price);
            }
        });

        booksByPrice.add(new Book("Java Basics", 499));
        booksByPrice.add(new Book("Advanced Java", 899));
        booksByPrice.add(new Book("Data Structures", 699));
        booksByPrice.add(new Book("Algorithms", 599));

        System.out.println("Books sorted by price:");
        for (Book book : booksByPrice) {
            System.out.println(book);
        }
    }
}
