class Solution {
    private Integer[][] dp;
    public boolean predictTheWinner(int[] nums) {
        int len = nums.length;
        dp = new Integer[len][len];

        return calculateStuff(nums, 0, len - 1) >= 0;
    }
    private int calculateStuff(int[] nums, int l, int r){
        if (l>r) return 0;
        if (l==r) return nums[l];

        if(dp[r][l] != null) return dp[r][l];

        int x = nums[l] - calculateStuff(nums, l+1, r);
        int y = nums[r] - calculateStuff(nums, l, r-1);

        dp[l][r] = Math.max(x, y);

        return dp[l][r];
    }
}