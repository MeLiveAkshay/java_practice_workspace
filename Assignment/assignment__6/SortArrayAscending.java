package assignment.assignment__6;

import java.util.Scanner;

public class SortArrayAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the length of the array (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Original  Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Bubble Sort in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array in Ascending Order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
