/*
 * Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
The majority element is the element that appears more than ⌊n / 2⌋times. You may assume that the majority element always exists in the array.
Sample Input 1: nums = [3,2,3]
Sample Output 1: 3
Sample Input 2: nums = [2,2,1,1,1,2,2]
Sample Output 2: 2
Constraints(extra Conditions):
●n == nums.length
●1 <= n <= 5 * 10^4
●-10^9 <= nums[i] <= 10^9
 */

public class Q02 {
    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    private static int majorityElementRec(int[] nums, int left, int right) {
        // Base case: if the array contains only one element
        if (left == right) {
            return nums[left];
        }

        // Recur for left and right halves
        int mid = left + (right - left) / 2;
        int leftMajority = majorityElementRec(nums, left, mid); // Majority element in left half
        int rightMajority = majorityElementRec(nums, mid + 1, right); // Majority element in right half

        // If both halves agree on the majority element
        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        // Count occurrences of each candidate in the current range
        int leftCount = countInRange(nums, leftMajority, left, right);
        int rightCount = countInRange(nums, rightMajority, left, right);

        // Return the element with the higher count
        return leftCount > rightCount ? leftMajority : rightMajority;
    }

    private static int countInRange(int[] nums, int candidate, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == candidate) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println("Majority Element in nums1: " + majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + majorityElement(nums2)); // Output: 2
    }
}
