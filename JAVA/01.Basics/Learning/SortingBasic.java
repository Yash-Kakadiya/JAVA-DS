import java.util.Arrays;
import java.util.Collections;

public class SortingBasic {

    public static void bubbleSort(int[] nums) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        // Stable Sort: Yes
        // In-Place Sort: Yes

        int n = nums.length;
        for (int i = 0; i < (n - 1); i++) {

            for (int j = 0; j < (n - 1 - i); j++) {

                if (nums[j] > nums[j + 1]) {
                    // nums[j]>nums[j+1] for ascending order
                    // nums[j]<nums[j+1] for descending order

                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        // Stable Sort: No
        // In-Place Sort: Yes

        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minPos] > nums[j]) {
                    // nums[minPos]>nums[j] for ascending order
                    // nums[minPos]<nums[j] for descending order
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        // Stable Sort: Yes
        // In-Place Sort: Yes

        for (int i = 1; i < nums.length - 1; i++) {

            int curr = nums[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && nums[prev] > curr) {
                // for ascending nums[prev]>curr
                // for descending nums[prev]<curr
                nums[prev + 1] = nums[prev];
                prev--;
            }
            // intertion
            nums[prev + 1] = curr;
        }
    }

    public static void countingSort(int[] nums) {
        // Time Complexity: O(n + k) where k is the range of input
        // Space Complexity: O(k)
        // Stable Sort: Yes
        // In-Place Sort: No
        int max = Integer.MIN_VALUE;

        // Finding the maximum element in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        // Initialize count array with all zeros
        int[] count = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }

        // Creating a count array of size max + 1
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Cummulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Output array
        int[] output = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }
        // Copying the output array to the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[i];
        }
    }

    public static void inbuiltSort(int[] nums) {
        // Generally for +ve and short range numbers
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        // Stable Sort: Yes
        // In-Place Sort: Yes

        Arrays.sort(nums);
        // Arrays.sort(nums, startIndex, endIndex); // for sorting a part of the array
    }

    public static void inbuiltSortDescending(Integer[] nums) {
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        // Stable Sort: Yes
        // In-Place Sort: Yes

        Arrays.sort(nums, Collections.reverseOrder());
        // Arrays.sort(nums, startIndex, endIndex, Collections.reverseOrder()); // for
        // sorting a part of the array
    }

    public static void printArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayInteger(Integer[] nums) {

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 3, 2, 1 };

        System.out.println("Using Bubble Sort");
        bubbleSort(nums);
        printArray(nums);

        System.out.println("Using Selection Sort");
        selectionSort(nums);
        printArray(nums);

        System.out.println("Using Insertion Sort");
        insertionSort(nums);
        printArray(nums);

        System.out.println("Using Counting Sort");
        countingSort(nums);
        printArray(nums);

        System.out.println("Using In-Built Sort");
        inbuiltSort(nums);
        printArray(nums);

        System.out.println("Using In-Built Sort in Descending Order");
        Integer nums2[] = { 4, 5, 3, 2, 1 };
        inbuiltSortDescending(nums2);
        printArrayInteger(nums2);
    }
}