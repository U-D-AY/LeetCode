class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        
        // Edge case: when n is 1, only [1,1,1] -> 1 is possible
        if (n == 1) {
            return 1;
        }
        // Edge case: when n is 2, only values 1 and 2 can be formed
        if (n == 2) {
            return 2;
        }
        
        // Find the position of the highest set bit in n
        // 32 - Integer.numberOfLeadingZeros(n) gives the exact bit count
        int bits = 32 - Integer.numberOfLeadingZeros(n);
        
        // Return 2 raised to the power of bits (1 shifted left by bits)
        return 1 << bits;
    }
}
