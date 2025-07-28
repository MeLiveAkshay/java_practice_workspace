package assignment.assignment__6;

public class RemoveDuplicates {

    // Manual sorting using Bubble Sort
    public void sortArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap nums[j] and nums[j+1]
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    // Remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
        nums[j++] = nums[n - 1]; // Add the last unique element
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicates obj = new RemoveDuplicates();

        int[] nums = {5, 2, 9, 4, 2, 9, 7, 5};

        System.out.print("Original array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        obj.sortArray(nums); // Sort the array manually

        int newLength = obj.removeDuplicates(nums); // Remove duplicates

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
