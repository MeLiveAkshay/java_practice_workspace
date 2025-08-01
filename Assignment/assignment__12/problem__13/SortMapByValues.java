package assignment.assignment__12.problem__13;

import java.util.*;

public class SortMapByValues {
    public static void main(String[] args) {
        // Sample Map with product and price
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("Milk", 50);
        productMap.put("Bread", 30);
        productMap.put("Eggs", 70);
        productMap.put("Butter", 100);
        productMap.put("Cheese", 90);

        // Convert entry set to a list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(productMap.entrySet());

        // Sort by value in descending order
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Print sorted entries
        System.out.println("Products sorted by price (descending):");
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": ₹" + entry.getValue());
        }
    }
}

