/*
 * Approach: Pivot & Partition/ Divide & Conquer
 * 1. Pivot
 * 2. partition(arr, pivot)
 * 3. quickSort(left half)
 *    quickSort(right half)
 */

public class QuickSort {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(n log n) on average, O(n^2) in worst case
    // Space Complexity: O(log n) due to recursion stack
    // Worst case occurs when the smallest or largest element is always chosen as
    // pivot(e.g., already sorted arrayṁ)
    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        // Partition the array
        int pivotIndex = partition(arr, low, high);

        // Recursively sort elements before and after partition
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);

    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] pivot(or arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8, 7 };
        System.out.println("Original Array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
