package assignment.assignment__12.problem__11;

import java.util.*;

class Student {
    String name;
    Map<String, Integer> subjectMarks; // subject → marks

    public Student(String name, Map<String, Integer> subjectMarks) {
        this.name = name;
        this.subjectMarks = subjectMarks;
    }
}

public class TopScorerPerSubject {
    public static void main(String[] args) {
        // Sample data
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", Map.of("Math", 90, "Physics", 80, "Chemistry", 85)));
        students.add(new Student("Bob", Map.of("Math", 95, "Physics", 75, "Chemistry", 88)));
        students.add(new Student("Charlie", Map.of("Math", 85, "Physics", 92, "Chemistry", 89)));

        // subject → top scorer
        Map<String, Student> topScorers = new HashMap<>();

        for (Student student : students) {
            for (Map.Entry<String, Integer> entry : student.subjectMarks.entrySet()) {
                String subject = entry.getKey();
                int marks = entry.getValue();

                if (!topScorers.containsKey(subject) ||
                        marks > topScorers.get(subject).subjectMarks.get(subject)) {
                    topScorers.put(subject, student);
                }
            }
        }

        // Display top scorer per subject
        System.out.println("Top Scorers by Subject:");
        for (Map.Entry<String, Student> entry : topScorers.entrySet()) {
            String subject = entry.getKey();
            Student student = entry.getValue();
            int marks = student.subjectMarks.get(subject);
            System.out.println(subject + ": " + student.name + " (" + marks + " marks)");
        }
    }
}
