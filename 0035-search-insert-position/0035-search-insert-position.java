class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int mid = (l + h)/2;

        while(l <= h){
            if(target == nums[mid])
                return mid;
            else if(target > nums[mid])
                l = mid + 1;
            else
                h = mid - 1;
            
            mid = (l + h)/2;
        }

        return l;
    }
}