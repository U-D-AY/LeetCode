class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int  i=0;
        long c=0;
        int j = nums.length -1;

        while(i<=j){
            if(i!=j){
                int temp = nums[j];
                int x = 1;
                while(temp>0){
                    x *= 10;
                    temp /= 10;
                }
                if(nums[j] == 0)
                    x = 10;

                c += nums[i] * x + nums[j];
            }
            else
                c+=nums[i];

            i++;
            j--;
        }

        return c;
    }
}