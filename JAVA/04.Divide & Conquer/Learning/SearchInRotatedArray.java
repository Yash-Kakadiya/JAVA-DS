/*
 * Search in Rotated Sorted Array(Medium Level (LeetCode 33))
 * input: sorted, rotated array with distint numbers(in ascending order). It is
 * rotated at some pivot unknown to you beforehand.
 * output: index of target if found, else -1
 * example: input: nums = [4,5,6,7,0,1,3], target = 0
 * output: 4
 */

public class SearchInRotatedArray {
    // Time Complexity: O(log n)
    // Space Complexity: O(1) for iterative, O(log n) for recursion due to call stack
    public static int searchRecursion(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1; // Base case: target not found
        }

        int mid = left + (right - left) / 2;

        // Target found
        if (nums[mid] == target) {
            return mid;
        }

        // Determine which side is properly sorted
        // mid on L1
        if (nums[left] <= nums[mid]) {
            // case a: target in left of L1
            if (target >= nums[left] && target < nums[mid]) {
                return searchRecursion(nums, target, left, mid - 1);
            } else {
                // case b: target in right of L1
                return searchRecursion(nums, target, mid + 1, right);
            }
        }
        // mid on L2
        else {
            // case c: target in right of L2
            if (target > nums[mid] && target <= nums[right]) {
                return searchRecursion(nums, target, mid + 1, right);
            }
            // case d: target in left of L2
            else {
                return searchRecursion(nums, target, left, mid - 1);
            }
        }

    }

    public static int searchIterative(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is properly sorted
            // mid on L1
            if (nums[left] <= nums[mid]) {
                // case a: target in left of L1
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    // case b: target in right of L1
                    left = mid + 1;
                }
            }
            // mid on L2
            else {
                // case c: target in right of L2
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                // case d: target in left of L2
                else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int result = searchRecursion(nums, target, 0, nums.length - 1);
        System.out.println("Index of target using recursion" + target + ": " + result);
        result = searchIterative(nums, target);
        System.out.println("Index of target using iteration" + target + ": " + result);
    }
}