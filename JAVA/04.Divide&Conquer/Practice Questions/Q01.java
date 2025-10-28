/*
 * Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings are in lowercase). (EASY)
Sample Input 1: arr = { "sun", "earth", "mars", "mercury" }
Sample Output 1: arr = { "earth", "mars", "mercury", "sun"}
 */

public class Q01 {
    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void mergeSort(String[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(String[] arr, int left, int mid, int right) {
        String[] temp = new String[right - left + 1];
        int i = left; // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int k = 0; // Starting index for temporary merged array

        while (i <= mid && j <= right) {
            if (arr[i].compareTo(arr[j]) <= 0) {
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
        String[] arr = { "sun", "earth", "mars", "mercury" };
        System.out.println("Before Sorting:");
        printArray(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Sorting:");
        printArray(arr);
    }
}