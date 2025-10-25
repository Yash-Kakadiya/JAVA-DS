public class CheckSortedArray {
    public static boolean isSortedAscending(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSortedAscending(arr, i + 1);
    }

    public static boolean isSortedDescending(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] < arr[i + 1]) {
            return false;
        }
        return isSortedAscending(arr, i + 1);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Ascending: " + isSortedAscending(arr, 0));
        System.out.println("Descending: " + isSortedDescending(arr, 0));
    }
}