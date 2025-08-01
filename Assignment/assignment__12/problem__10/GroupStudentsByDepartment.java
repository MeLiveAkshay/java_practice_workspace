package assignment.assignment__12.problem__10;
import java.util.*;

class Student {
    String name;
    String dept;
    int marks;

    public Student(String name, String dept, int marks) {
        this.name = name;
        this.dept = dept;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + " marks)";
    }
}

public class GroupStudentsByDepartment {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", "CS", 85),
            new Student("Bob", "IT", 78),
            new Student("Charlie", "CS", 92),
            new Student("David", "EC", 74),
            new Student("Eve", "IT", 88)
        );

        Map<String, List<Student>> deptMap = new HashMap<>();

        for (Student student : students) {
            deptMap.computeIfAbsent(student.dept, k -> new ArrayList<>()).add(student);
        }

        // Display grouped students
        for (Map.Entry<String, List<Student>> entry : deptMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println("  → " + s);
            }
        }
    }
}
