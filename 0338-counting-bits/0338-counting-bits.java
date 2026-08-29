class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        
        // Build the solution iteratively using previous results
        for (int i = 1; i <= n; i++) {
            // ans[i >> 1] gets the bits of i/2
            // (i & 1) adds 1 if the number is odd
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}