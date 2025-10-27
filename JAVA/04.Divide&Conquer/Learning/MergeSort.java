/*
 * Approach:
 * 1. Divide
 * 2. mergeSort(left half)
 *    mergeSort(right half)
 * 3. Conquer (merge two sorted halves)
 */

public class MergeSort {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int mid = left + (right - left) / 2;

        // Sort first and second halves
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // Merge the sorted halves
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left; // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int k = 0; // Starting index for temporary merged array

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        // Copy the merged temporary array back to the original array
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 6, 3, 9, 5, 2, 8, 7 };
        System.out.println("Original Array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
