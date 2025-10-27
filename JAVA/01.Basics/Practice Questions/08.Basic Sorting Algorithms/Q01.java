/*Question : Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort */

public class Q01 {

    public static void bubbleSortDescending(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortDescending(int[] nums) {
        int n = nums.length;
        int maxIdx = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                if (nums[maxIdx] < nums[j]) {
                    maxIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIdx];
            nums[maxIdx] = temp;
        }
    }

    public static void insertionSortDescending(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n - 1; i++) {
            int curr = nums[i];
            int prev = i - 1;

            while (prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void countingSortDescending(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = max - 1; i >= 0; i--) {
            count[i] += count[i + 1];
        }

        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            output[count[nums[i]] - 1] = nums[i];
            count[nums[i]]--;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[i];
        }
    }

    public static void printArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        printArray(nums);

        // Descending sorts

        // bubbleSortDescending(nums);
        // printArray(nums);

        // selectionSortDescending(nums);
        // printArray(nums);

        // insertionSortDescending(nums);
        // printArray(nums);

        countingSortDescending(nums);
        printArray(nums);
    }
}