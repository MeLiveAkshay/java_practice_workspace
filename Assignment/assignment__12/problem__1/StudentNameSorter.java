package assignment.assignment__12.problem__1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentNameSorter {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Collect names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        // Sort the list alphabetically
        Collections.sort(studentNames);

        // Display sorted names
        System.out.println("\nSorted Student Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}

