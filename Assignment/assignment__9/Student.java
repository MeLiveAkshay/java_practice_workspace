package assignment.assignment__9;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    int rollNo;
    String name;
    double percentage;

    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
    }
}
