/*Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [ [-1, -1, 2] , [-1, 0, 1] ]
3
2
1
0
Example 2:
Input: nums = [ ]
Output: [ ]
Example 3:
Input: nums = [ 0 ]
Output: [ ]
Constraints:
• 0 <= nums . length <= 3000
• -10^5 <= nums [ i ] <= 10^5 */

import java.util.*;
public class Q03 {

    public static List<List<Integer>> threeSumBruteForce(int[] nums) {

        // Time Complexity: O(n^3)
        // Space Complexity: O(n) for the output list
        List<List<Integer>> result = new ArrayList<List<Integer>>(); // to store unique triplets
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet); // Sort the triplet to ensure uniqueness
                        // Check if the triplet is already in the result to avoid duplicates
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<>(new HashSet<>(result)); // Remove duplicates
        return result;
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        // Time Complexity: O(n^2)
        // Space Complexity: O(n) for the output list
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to use two-pointer technique

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue; // Skip duplicates

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1])
                        left++; // Skip duplicates
                    while (left < right && nums[right] == nums[right - 1])
                        right--; // Skip duplicates
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(nums);
        List<List<Integer>> result2 = threeSumBruteForce(nums);
        System.out.println(result); // Output: [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(result2); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
}
