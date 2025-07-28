package assignment.assignment__9;

import java.io.*;
import java.util.Scanner;

public class SumFromFile {
    public static void main(String[] args) {
        String fileName = "numbers.txt"; // You can change this or take from user

        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File does not exist: " + fileName);
            return;
        }

        int sum = 0;

        try (Scanner scanner = new Scanner(file)) {
            // Use delimiter to handle spaces, newlines, commas, etc.
            scanner.useDelimiter("[,\\s]+");

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    sum += num;
                } else {
                    scanner.next(); // skip non-integer token
                }
            }

            System.out.println("Sum of integers in " + fileName + " = " + sum);

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
