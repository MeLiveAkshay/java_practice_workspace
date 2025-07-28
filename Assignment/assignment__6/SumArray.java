package assignment.assignment__6;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Get array size
			System.out.print("Enter the length of the array (n): ");
			int n = scanner.nextInt();

			int[] array = new int[n];

			// Input array elements
			System.out.println("Enter " + n + " elements:");
			for (int i = 0; i < n; i++) {
			    array[i] = scanner.nextInt();
			}
			int sum=0;
			for (int i = 0; i < n; i++) {
			    sum+=array[i];
			}
			System.out.println("Sum of all elements: " + sum);
		}
        
    }
}
