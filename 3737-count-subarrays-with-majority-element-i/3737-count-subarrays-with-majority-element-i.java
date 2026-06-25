class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        int n = nums.length;

        // 1. Pick the starting boundary of the subarray
        for (int i = 0; i < n; i++) {
            int netBalance = 0;

            // 2. Expand the ending boundary of the subarray incrementally
            for (int j = i; j < n; j++) {
                // If it matches target, score goes up. Otherwise, it drops.
                if (nums[j] == target) {
                    netBalance++;
                } else {
                    netBalance--;
                }

                // 3. If balance is strictly positive, target is the majority element
                if (netBalance > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
