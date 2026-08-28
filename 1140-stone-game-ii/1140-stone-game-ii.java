class Solution {
    private int[][] memo;
    private int[] suffix;
    private int n;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        suffix = new int[n + 1];
        
        // M only reaches up to n / 2 + 1 due to the base-case optimization
        memo = new int[n + 1][n / 2 + 2];

        // Precompute suffix sums
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return dp(0, 1);
    }

    private int dp(int i, int M) {
        // Base Case: current player can take all remaining piles
        if (i + 2 * M >= n) {
            return suffix[i];
        }
        
        if (memo[i][M] != 0) {
            return memo[i][M];
        }

        int maxStones = 0;
        
        // Try taking X piles (1 <= X <= 2M)
        for (int X = 1; X <= 2 * M; X++) {
            int opponentStones = dp(i + X, Math.max(M, X));
            // Current player's score = total remaining stones - optimal opponent score
            maxStones = Math.max(maxStones, suffix[i] - opponentStones);
        }

        memo[i][M] = maxStones;
        return maxStones;
    }
}