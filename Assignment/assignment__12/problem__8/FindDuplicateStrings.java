package assignment.assignment__12.problem__8;

import java.util.*;

public class FindDuplicateStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob");

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!seen.add(name)) {
                duplicates.add(name);
            }
        }

        System.out.println("Duplicate names: " + duplicates);
    }
}
