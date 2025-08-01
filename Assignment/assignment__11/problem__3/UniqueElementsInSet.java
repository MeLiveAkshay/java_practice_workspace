package assignment.assignment__11.problem__3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElementsInSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Set<Integer> uniqueNumbers = new HashSet<>();

        System.out.println("Enter integers (type 'done' to stop):");

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (uniqueNumbers.add(number)) {
                    System.out.println(number + " added.");
                } else {
                    System.out.println(number + " is a duplicate and won't be added.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        scanner.close();

       
        System.out.println("\nUnique integers entered:");
        for (int num : uniqueNumbers) {
            System.out.println(num);
        }
    }
}
