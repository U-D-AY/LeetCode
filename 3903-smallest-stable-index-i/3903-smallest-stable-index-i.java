class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }

        // Step 1: Precompute the suffix minimums
        int[] suffixMin = new int[n];
        int currentMin = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < currentMin) {
                currentMin = nums[i];
            }
            suffixMin[i] = currentMin;
        }

        // Step 2: Iterate forward to find the smallest stable index
        int prefixMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] > prefixMax) {
                prefixMax = nums[i];
            }

            // Calculate instability score
            int instabilityScore = prefixMax - suffixMin[i];

            // Return the first (smallest) index that matches the criteria
            if (instabilityScore <= k) {
                return i;
            }
        }

        return -1;
    }
}