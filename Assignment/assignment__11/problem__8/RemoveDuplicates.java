package assignment.assignment__11.problem__8;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        String[] tokens = input.split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String token : tokens) {
            numbers.add(Integer.parseInt(token));
        }

        // Step 2: Remove duplicates using a LinkedHashSet (preserves order)
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        // Step 3: Convert back to list if needed
        List<Integer> resultList = new ArrayList<>(uniqueNumbers);

        // Step 4: Print the updated list
        System.out.println("List after removing duplicates:");
        for (int number : resultList) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
