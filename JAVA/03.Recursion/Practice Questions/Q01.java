/*
 * Question 1 : For a given integer array of size N. You have to find all the occurrences(indices) of a given element (Key) and print them. Use a recursive function to solve this problem.
 * Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
   key = 2,
   Sample Output : 1 5 7 8
 */
public class Q01 {

    public static void findOccurrences(int[] arr, int key, int index) {
        // Base case: if index reaches the length of the array
        if (index == arr.length) {
            return;
        }

        // If the current element matches the key, print the index
        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        // Recursive call for the next index
        findOccurrences(arr, key, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 2, 5 };
        int key = 2;
        System.out.print("Occurrences of " + key + " are at indices: ");
        findOccurrences(arr, key, 0);
    }

}
