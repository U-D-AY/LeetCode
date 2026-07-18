class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            int x = nums[i];
            if (x>max){
                max = x;
            }
            if (x<min){
                min = x;
            }
        }

        while(min>0){
            int temp = min;
            min = max % min;
            max = temp;
        }

        return max;
    }
}