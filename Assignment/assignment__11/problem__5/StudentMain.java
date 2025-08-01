package assignment.assignment__11.problem__5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        
        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine(); // consume newline

            students.add(new Student(name, marks));
        }

        // Sort by marks (ascending)
        Collections.sort(students, Comparator.comparingInt(Student::getMarks));

        // Display sorted list
        System.out.println("\n--- Sorted Students by Marks (Ascending) ---");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
