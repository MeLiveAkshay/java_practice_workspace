package assignment.assignment__12.problem__9;

import java.util.*;

public class ProductPriceMap {
    public static void main(String[] args) {
        // Create a LinkedHashMap to maintain insertion order
        LinkedHashMap<String, Integer> productMap = new LinkedHashMap<>();

        // Add product and price
        productMap.put("Milk", 50);
        productMap.put("Bread", 30);
        productMap.put("Eggs", 70);
        productMap.put("Butter", 100);
        productMap.put("Cheese", 120);

        // Print the entries in insertion order
        System.out.println("Product Prices (in insertion order):");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: ₹" + entry.getValue());
        }
    }
}

