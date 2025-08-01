package assignment.assignment__11.problem__13;

import java.util.*;

public class CourseManager {
    private Map<String, Set<String>> courseToStudents = new HashMap<>();
    private Map<String, Set<String>> studentToCourses = new HashMap<>();

    // Add student to a course
    public void addStudentToCourse(String studentName, String courseName) {
        courseToStudents.putIfAbsent(courseName, new HashSet<>());
        studentToCourses.putIfAbsent(studentName, new HashSet<>());

        courseToStudents.get(courseName).add(studentName);
        studentToCourses.get(studentName).add(courseName);

        System.out.println("✅ Added " + studentName + " to " + courseName);
    }

    // Display all students in a course
    public void displayStudentsInCourse(String courseName) {
        Set<String> students = courseToStudents.get(courseName);
        if (students == null || students.isEmpty()) {
            System.out.println("❌ No students found for course: " + courseName);
        } else {
            System.out.println("📚 Students in " + courseName + ": " + students);
        }
    }

    // Remove student from a course
    public void removeStudentFromCourse(String studentName, String courseName) {
        if (courseToStudents.containsKey(courseName)) {
            courseToStudents.get(courseName).remove(studentName);
        }
        if (studentToCourses.containsKey(studentName)) {
            studentToCourses.get(studentName).remove(courseName);
        }
        System.out.println("🗑️ Removed " + studentName + " from " + courseName);
    }

    // List all courses for a student
    public void listCoursesForStudent(String studentName) {
        Set<String> courses = studentToCourses.get(studentName);
        if (courses == null || courses.isEmpty()) {
            System.out.println("❌ " + studentName + " is not enrolled in any courses.");
        } else {
            System.out.println("📘 " + studentName + " is enrolled in: " + courses);
        }
    }

    // Sample main to test the functionality
    public static void main(String[] args) {
        CourseManager manager = new CourseManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Course Enrollment Menu:");
            System.out.println("1. Add Student to Course");
            System.out.println("2. Display Students in Course");
            System.out.println("3. Remove Student from Course");
            System.out.println("4. List Courses for a Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String s1 = scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String c1 = scanner.nextLine();
                    manager.addStudentToCourse(s1, c1);
                    break;

                case 2:
                    System.out.print("Enter course name: ");
                    String c2 = scanner.nextLine();
                    manager.displayStudentsInCourse(c2);
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    String s2 = scanner.nextLine();
                    System.out.print("Enter course name: ");
                    String c3 = scanner.nextLine();
                    manager.removeStudentFromCourse(s2, c3);
                    break;

                case 4:
                    System.out.print("Enter student name: ");
                    String s3 = scanner.nextLine();
                    manager.listCoursesForStudent(s3);
                    break;

                case 5:
                    System.out.println("👋 Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        }
    }
}

