class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;

        for(int i=0; i < len; i++){
            if(start + i < len && nums[start + i] == target)
            return i;
            if(start - i >= 0 && nums[start - i] == target)
            return i;
        }
        return -1;
    }
}