package assignment.assignment__9;

import java.io.*;
import java.util.Scanner;

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept student details from user
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        Student student = new Student(rollNo, name, percentage);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Student object serialized to student.ser");
        } catch (IOException e) {
            System.out.println("Serialization failed: " + e.getMessage());
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student object:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed: " + e.getMessage());
        }

        scanner.close();
    }
}
