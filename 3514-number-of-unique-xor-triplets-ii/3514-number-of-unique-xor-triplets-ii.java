class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // 1. Determine the range needed for the boolean arrays.
        // The maximum possible XOR value of 11-bit numbers (up to 1500) 
        // will always be less than 2048. Using 4096 covers all edge cases safely.
        int LIMIT = 4096; 
        
        boolean[] seenPairs = new boolean[LIMIT];
        boolean[] seenTriplets = new boolean[LIMIT];

        // Phase 1: Build the set of all possible Pair XORs (a ^ b)
        // Time: O(N^2)
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int val = nums[i] ^ nums[j];
                seenPairs[val] = true;
            }
        }

        // Phase 2: Build Triplets by XORing Pairs with a third number (pair ^ c)
        // Time: O(Range * N) -> 4096 * 1500 ≈ 6M operations (Fast)
        // We iterate through the 'seenPairs' array to avoid O(N^3)
        for (int p = 0; p < LIMIT; p++) {
            if (seenPairs[p]) {
                for (int num : nums) {
                    int tripletVal = p ^ num;
                    seenTriplets[tripletVal] = true;
                }
            }
        }

        // 3. Count the unique values found
        int count = 0;
        for (boolean val : seenTriplets) {
            if (val) count++;
        }
        return count;
    }
}
