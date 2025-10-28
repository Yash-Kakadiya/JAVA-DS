/*
 * Question 3 : Given an array of integers. Find the Inversion Count in the array. (HARD)
Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in the reverse order then the inversion count is the maximum.
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
Sample Output 1: 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).
Sample Input 2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
Sample Output 2: 0, because the array is already sorted
Sample Input 3: N = 3, arr[] = {5, 5, 5}
Sample Output 3 : 0, because all the elements of the array are the same & already in a sorted
manner.
(Hint: A sorting algorithm will be used to solve this question.)
Note - This question is important. Even if you are not able to come up with the approach,
please understand the solution.
 */

public class Q03 {
    public static int countInversions(int[] arr, int left, int right) {
        int mid, invCount = 0;
        if (left >= right) {
            return invCount;
        }

        mid = left + (right - left) / 2;

        invCount += countInversions(arr, left, mid);
        invCount += countInversions(arr, mid + 1, right);
        invCount += mergeAndCount(arr, left, mid, right);
        return invCount;
    }

    public static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        int n = arr.length;
        int inversionCount = countInversions(arr, 0, n - 1);
        System.out.println("Inversion Count: " + inversionCount);
    }
}