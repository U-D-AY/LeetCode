class Solution {
    public int maximumProduct(int[] nums) {
        int x = Integer.MIN_VALUE;
        int y = x;
        int z = x;

        int x1 = Integer.MAX_VALUE;
        int y1 = x1;

        int sol = 0; 

        for(int i = 0; i<nums.length; i++){
            int w = nums[i];
            if(w>x){
                z = y;
                y = x;
                x = w;
            }
            else if(w>y){
                z = y;
                y = w;
            }
            else if(w>z){
                z = w;
            }

            if(w<x1){
                y1 = x1;
                x1 = w;
            }
            else if(w<y1){
                y1 = w;
            }

        }
        
        return Math.max(x*y*z, x1*y1*x);
    }
}