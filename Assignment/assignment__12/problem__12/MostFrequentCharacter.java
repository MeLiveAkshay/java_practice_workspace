package assignment.assignment__12.problem__12;
import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // ignore case

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) continue; // skip spaces
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Most frequent character: '" + mostFrequent + "' occurred " + maxCount + " times.");
    }
}
