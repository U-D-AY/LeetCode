class Solution {
    public boolean predictTheWinner(int[] nums) {
        return solve(nums, 0, nums.length - 1) >= 0;
    }
    private int solve(int[] nums, int l, int r){
        if(l==r) return nums[l];

        int left = nums[l] - solve(nums, l + 1, r);
        int right = nums[r] - solve(nums, l, r-1);

        return Math.max(left, right);
    }
}