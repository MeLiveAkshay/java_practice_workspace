package assignment.assignment__12.problem__2;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();

        System.out.print("Enter how many numbers you want to input: ");
        int count = scanner.nextInt();

        // Accept numbers from the user
        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numberList.add(number);
        }

        // Remove duplicates using HashSet
        Set<Integer> uniqueNumbers = new HashSet<>(numberList);

        // Display unique values
        System.out.println("\nUnique values after removing duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

