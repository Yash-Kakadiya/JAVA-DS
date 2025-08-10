public class TrappingRainWater {

    public static int trappedRainWaterAuxiliaryArrays(int[] height, int width) {
        // Time Complexity: O(n)
        // Space Complexity: O(n)

        int n = height.length;

        // Auxiliary arrays = helping arrays
        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {

            // Water Level = min(left max boundary,right max boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater=waterlevel-height[i]
            trappedWater += (waterLevel - height[i]) * width;

        }
        return trappedWater;

    }

    public static int trappedWaterTwoPointers(int[] height, int width) {
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int n = height.length;
        int left = 0, right = n - 1; // Two pointers
        int leftMax = 0, rightMax = 0; // Max boundaries
        int trappedWater = 0; // Total trapped water

        // Loop until the two pointers meet
        while (left < right) {
            // Compare the heights at the two pointers
            if (height[left] < height[right]) {
                // Update the left max boundary
                if (leftMax < height[left]) {
                    leftMax = height[left];
                }
                // Calculate trapped water at the left pointer
                // Water Level = leftMax
                trappedWater += (leftMax - height[left]) * width;
                left++;
            } else {
                // Update the right max boundary
                if (rightMax < height[right]) {
                    rightMax = height[right];
                }
                // Calculate trapped water at the right pointer
                // Water Level = rightMax
                trappedWater += (rightMax - height[right]) * width;
                right--;
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;

        System.out.println(trappedRainWaterAuxiliaryArrays(height, width));
        System.out.println(trappedWaterTwoPointers(height, width));
    }
}
