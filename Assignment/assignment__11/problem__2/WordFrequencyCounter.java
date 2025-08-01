package assignment.assignment__11.problem__2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph of text:");
        String paragraph = scanner.nextLine();


        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        
        String[] words = paragraph.split("\\s+");

        
        Map<String, Integer> wordCountMap = new HashMap<>();

        
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
