package assignment.assignment__11.problem__9;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first list
        System.out.print("Enter integers for List 1 (space-separated): ");
        String[] input1 = scanner.nextLine().split("\\s+");
        List<Integer> list1 = new ArrayList<>();
        for (String s : input1) {
            list1.add(Integer.parseInt(s));
        }

        // Input for second list
        System.out.print("Enter integers for List 2 (space-separated): ");
        String[] input2 = scanner.nextLine().split("\\s+");
        List<Integer> list2 = new ArrayList<>();
        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }

        // Merge using Set to remove duplicates (preserve order using LinkedHashSet)
        Set<Integer> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);

        // Convert back to list (optional)
        List<Integer> mergedList = new ArrayList<>(mergedSet);

        // Display result
        System.out.println("Merged list without duplicates:");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
