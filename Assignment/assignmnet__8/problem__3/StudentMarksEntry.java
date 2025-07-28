package assignment.assignmnet__8.problem__3;

import java.util.Scanner;




public class StudentMarksEntry {
    public static Scanner scanner = new Scanner(System.in);
    static int[] mark = new int[5];
    public static int totalMarks = 0;

    public static void main(String[] args) {
        System.out.println("Enter the Marks for the 5 Subjects (0-100)");

        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                    System.out.print("Subject " + (i + 1) + ": ");
                    int input = scanner.nextInt();

                    // Throw custom exception if invalid
                    if (input < 0 || input > 100) {
                        throw new InvalidMarksException("Invalid marks for Subject " + (i + 1) + ": " + input + " (Must be 0-100)");
                    }

                    mark[i] = input;
                    totalMarks += input;
                    break; // Exit loop if valid
                } catch (InvalidMarksException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Please enter a valid integer.");
                    scanner.next(); // clear invalid input
                }
            }
        }

        double average = totalMarks / 5.0;
        System.out.println("\nAverage Marks: " + average);

        // Display grade
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        System.out.println("Grade: " + grade);
    }
}
