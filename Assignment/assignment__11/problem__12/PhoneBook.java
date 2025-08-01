package assignment.assignment__11.problem__12;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu display
            System.out.println(" Phone Book Menu:");
            System.out.println("1. Add new phone book entry");
            System.out.println("2. Search Phone Number");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // Add new entry
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine().trim();
                    phoneBook.put(name, phone);
                    System.out.println(" Entry added.");
                    break;

                case 2:
                    // Search entry
                    System.out.print("Enter Name to search: ");
                    String searchName = scanner.nextLine().trim();
                    if (phoneBook.containsKey(searchName)) {
                        System.out.println(" Phone Number: " + phoneBook.get(searchName));
                    } else {
                        System.out.println(" No entry found for '" + searchName + "'.");
                    }
                    break;

                case 3:
                    System.out.println(" Exiting Phone Book. Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid option. Please enter 1, 2, or 3.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
