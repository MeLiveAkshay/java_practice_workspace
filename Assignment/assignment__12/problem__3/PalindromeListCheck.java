package assignment.assignment__12.problem__3;

import java.util.*;

public class PalindromeListCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        if (isPalindrome(list)) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(List<Integer> list) {
        int start = 0, end = list.size() - 1;
        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

