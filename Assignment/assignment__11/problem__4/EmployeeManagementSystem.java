package assignment.assignment__11.problem__4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    employeeMap.put(id, new Employee(name, dept));
                    System.out.println("Employee added.");
                }
                case 2 -> {
                    System.out.print("Enter Employee ID to update: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (employeeMap.containsKey(id)) {
                        System.out.print("Enter new Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter new Department: ");
                        String dept = scanner.nextLine();
                        Employee emp = employeeMap.get(id);
                        emp.setName(name);
                        emp.setDepartment(dept);
                        System.out.println("Employee updated.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter Employee ID to remove: ");
                    int id = scanner.nextInt();
                    if (employeeMap.remove(id) != null) {
                        System.out.println("Employee removed.");
                    } else {
                        System.out.println("Employee ID not found.");
                    }
                }
                case 4 -> {
                    if (employeeMap.isEmpty()) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("\nEmployee List:");
                        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
                        }
                    }
                }
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
