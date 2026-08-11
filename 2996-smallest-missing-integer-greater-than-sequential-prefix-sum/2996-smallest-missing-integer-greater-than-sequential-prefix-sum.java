import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {
        // Step 1: Calculate the longest sequential prefix sum
        int prefixSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                prefixSum += nums[i];
            } else {
                break;
            }
        }
        
        // Step 2: Store elements in a hash set
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // Step 3: Increment prefixSum until it's missing from the set
        while (set.contains(prefixSum)) {
            prefixSum++;
        }
        
        return prefixSum;
    }
}