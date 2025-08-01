package assignment.assignment__12.problem__7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("\n--- Mini Contact Book ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String nameToAdd = scanner.nextLine();
                    System.out.print("Enter contact number: ");
                    String numberToAdd = scanner.nextLine();
                    phoneBook.put(nameToAdd, numberToAdd);
                    System.out.println("Contact added.");
                    break;

                case 2:
                    System.out.print("Enter name to update: ");
                    String nameToUpdate = scanner.nextLine();
                    if (phoneBook.containsKey(nameToUpdate)) {
                        System.out.print("Enter new contact number: ");
                        String newNumber = scanner.nextLine();
                        phoneBook.put(nameToUpdate, newNumber);
                        System.out.println("Contact updated.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (phoneBook.remove(nameToDelete) != null) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    String nameToSearch = scanner.nextLine();
                    if (phoneBook.containsKey(nameToSearch)) {
                        System.out.println("Phone Number: " + phoneBook.get(nameToSearch));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 5:
                    System.out.println("All Contacts:");
                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                        System.out.println(entry.getKey() + " → " + entry.getValue());
                    }
                    break;

                case 6:
                    System.out.println("Exiting Contact Book. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
