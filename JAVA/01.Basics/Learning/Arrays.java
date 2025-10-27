public class Arrays {

    public static void update(int marks[], int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int nums[]) {
        int max = Integer.MIN_VALUE; // (-infinity) minimum value in a particular data type
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static int getsmallest(int nums[]) {
        int min = Integer.MAX_VALUE; // (+infinity) maximum vlaue in a particular data type
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int binarySearch(int nums[], int key) {
        // Binary Search works on Sorted Array

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (key == nums[mid]) {
                return mid;
            }
            if (key > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            // swap
            int temp;
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void printPairs(int nums[]) {

        for (int i = 0; i < nums.length; i++) {

            // int current = nums[i]; // For Simplicity

            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ") ");

            }
            System.out.println();
        }
        // total pairs= n(n-1)/2
        System.out.println("Total Pairs : " + (nums.length * (nums.length - 1) / 2));
    }

    public static void printSubarrays(int nums[]) {
        int totalsubarrays = 0;

        for (int i = 0; i < nums.length; i++) {
            // int start = i;
            for (int j = i; j < nums.length; j++) {
                // int end = j;
                // Print
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                totalsubarrays++;
                System.out.println();
            }
            System.out.println("--------------------------------------------------");
        }
        // Total Subarrays = n(n+1)/2
        System.out.println("Total Subarrays=" + totalsubarrays);
    }

    public static void maxMinSubarraySumBruteForce(int nums[]) {
        // Brute Force Approach
        // Time Complexity O(n^3)
        // Space Complexity O(1)

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                // Print
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    // Sum
                    currSum = currSum + nums[k];
                }
                System.out.print(" -----------------> Sum of Sub Array : " + currSum);

                // maximum Sum
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // minimum Sum
                if (minSum > currSum) {
                    minSum = currSum;
                }
                System.out.println();
            }
            System.out.println("--------------------------------------------------");

        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void maxMinSubarrayPrefixSum(int nums[]) {
        // Prefix/Cummulative Sum Approach
        // Time Complexity O(n^2)
        // Space Complexity O(n)

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        int prefixArr[] = new int[nums.length];

        // Calculate Prefix/Cummulative Sum Array
        prefixArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixArr[i] = prefixArr[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = prefixArr[j] - (i == 0 ? 0 : prefixArr[i - 1]);

                // maximum Sum
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
                // minimum Sum
                if (minSum > currSum) {
                    minSum = currSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
        System.out.println("Minimum Subarray Sum: " + minSum);
    }

    public static void maxSubarraySumKadanes(int nums[]) {
        // Kadane's Algorithm (Optimised)
        // Time Complexity O(n)
        // Space Complexity O(1)
        int currentSum = 0;
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Max Subarray Sum Possible : " + maxSum);
    }

    public static void minSubarraySumKadanes(int nums[]) {
        // Kadane's Algorithm (Optimised)
        // Time Complexity O(n)
        // Space Complexity O(1)

        int minSum = nums[0];
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            minSum = Math.min(currSum, minSum);

            if (currSum > 0) {
                currSum = 0;
            }
        }

        System.out.println("Min Subarray Sum Possible : " + minSum);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int marks[] = { 97, 98, 99 };
        int nonchangable = 7;
        update(marks, nonchangable);

        System.out.println(nonchangable);
        System.out.println("--------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("--------------------------------------");
        // ---------------------------------------------------

        int nums[] = { 2, 6, 8, 10, 12, 14, 16 };
        int key = 10;

        int index = linearSearch(nums, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println(key + " Found at " + (index + 1) + "th position or " + index + "th index");
        }
        System.out.println("--------------------------------------");
        // ---------------------------------------------------

        int largest = getlargest(nums);
        System.out.println("Largest is :" + largest);

        int smallest = getsmallest(nums);
        System.out.println("Smallest is : " + smallest);

        System.out.println("--------------------------------------");
        // ---------------------------------------------------
        // Binary Search (Arrray Should be Shorted)

        System.out.println("Index for Key(" + key + ") using Binary Search is " + binarySearch(nums, key));
        System.out.println("--------------------------------------");

        // ---------------------------------------------------
        // Reverse An Array
        int arr[] = { 1, 2, 3, 4 };
        reverse(arr);
        System.out.println("Reversed Array : ");
        printArray(arr);

        System.out.println("--------------------------------------");

        // ---------------------------------------------------
        // Pairs In An Array
        System.out.println("Pairs in the Array : ");
        printPairs(nums);

        System.out.println("--------------------------------------");

        // ---------------------------------------------------
        // Print SubArrays , Sum of Subarrays, max of sum, min of sum.
        System.out.println("SubArrays in the Array : ");
        printSubarrays(nums);

        System.out.println("--------------------------------------");

        // ---------------------------------------------------
        System.out.println("Maximum and Minimum Sum of Subarrays : ");
        // Maximum and Minimum Sum of Subarrays (Brute Force)
        maxMinSubarraySumBruteForce(nums);

        System.out.println("--------------------------------------");

        // ---------------------------------------------------
        // Prefix Sum

        System.out.println("Prefix Sum of the Array : ");
        maxMinSubarrayPrefixSum(nums);

        System.out.println("--------------------------------------");

        // ---------------------------------------------------

        // Maximum Possible Subarray Sum (Kadane's Algorithm)(Optimised)
        // int[] num = { -2, -3, -4, -1, -2, -1, -5, -3 };
        // int[] num = { 2, 3, 4, 1, 2, 1, 5, 3 };
        int[] num = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maxSubarraySumKadanes(num);
        minSubarraySumKadanes(nums);

        System.out.println("--------------------------------------");

    }

}
