class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;

        if(l<1) return 0;

        int p = 0;
        for(int i=0; i<l; i++)
        {
            if(nums[i]!=val){
                nums[p] = nums[i];
                p += 1;
            }
        }

        return p;
    }
}