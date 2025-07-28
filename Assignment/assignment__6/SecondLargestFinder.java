
package assignment.assignment__6;

import java.util.Scanner;

/*
 * Write a Java program to find the second largest number in an array.
 */
public class SecondLargestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to input the array length
        System.out.println("Enter the length of the Array (n): ");
        int n = scanner.nextInt();

        // Declare and initialize the array
        int[] array = new int[n];
        System.out.println("Enter the Elements: ");

        // Populate the array with user input
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Call method to find second largest number
        int secondMaxNumber = findSecondMaxNumber(array);

        // Print the result
        System.out.println("Second largest number is: " + secondMaxNumber);

        scanner.close(); // Good practice to close the scanner
    }

    // Method to find the second largest number
    private static int findSecondMaxNumber(int[] array) {
        // Step 1: Find the largest (max) value in the array
        int maxValue = findMax(array);

        // Step 2: Replace all occurrences of the max value with Integer.MIN_VALUE
        // This ensures we can ignore the largest number in the next search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                array[i] = Integer.MIN_VALUE;
            }
        }

        // Step 3: Find the max value again, which now will be the second largest
        int secondMax = findMax(array);

        return secondMax;
    }

    // Helper method to find the maximum value in an array
    private static int findMax(int[] array) {
        int maxValue = Integer.MIN_VALUE; // Initialize with smallest possible integer
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
}

































/**

package assignment.assignment__6;

import java.util.Scanner;


 Write a Java program to find the second largest number in an array.
 
public class SecondLargestFinder {
	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in);
		System.out.println("Enter the length of the Array (n): ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int secondMaxNumber=findSecondMaxNumber(array);
	}

	private static int findSecondMaxNumber(int[] array) {
		int maxValue=findMax(array);
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==maxValue) {
				array[i]=Integer.MIN_VALUE;
			}
		}
		int secondMax=findMax(array);
		return secondMax;
	}

	private static int findMax(int[] array) {
		int maxValue=Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>maxValue)
			{
				maxValue=array[i];
			}
		}
		return maxValue;
		
	}
}
**/


