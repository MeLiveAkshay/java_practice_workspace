package assignment.assignment__12.problem__4;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String input = "Java is easy and Java is powerful";

       
        String[] words = input.split("\\s+"); 

        
        Map<String, Integer> wordCount = new HashMap<>();

       
        for (String word : words) {
            
            word = word.toLowerCase();

            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print the word frequencies
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
