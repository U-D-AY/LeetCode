class Solution {
    public void moveZeroes(int[] nums) {
        int id = 0;
        int n = nums.length;

        for (int i = 0; i<n; i++){
            if(nums[i] == 0)
                continue;
            else
                nums[id++] = nums[i];
        }

        for(int i = id; i<n; i++)
            nums[i] = 0;
       
    }
}