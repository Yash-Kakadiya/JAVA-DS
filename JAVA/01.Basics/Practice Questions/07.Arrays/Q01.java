/*Question 1: Given an integer array nums, return true if any value appears at le ast twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true
Constraints:
• 1 <= nums . length <= 10^5
• -10^9 <= nums [ i ] <= 10^9 */

import java.util.HashSet;

public class Q01 {
    public static boolean containsDuplicateBruteForce(int[] nums) {
        int n = nums.length;

        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateUsingSet(int[] nums) {
        int n = nums.length;

        // Time Complexity: O(n)
        // Space Complexity: O(n)
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicateBruteForce(nums));
        System.out.println(containsDuplicateUsingSet(nums));
    }
}
