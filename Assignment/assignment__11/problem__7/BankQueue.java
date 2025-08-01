package assignment.assignment__11.problem__7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankQueue {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Bank Queue Menu ---");
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. View queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.add(name);
                    System.out.println(name + " added to the queue.");
                    break;

                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in the queue.");
                    } else {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Served: " + servedCustomer);
                    }
                    break;

                case 3:
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("Customers in queue: " + customerQueue);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
