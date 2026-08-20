class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;

        if (n<=2) return nums;

        int[] first = new int[n];
        first[0] = nums[0];
        int[] second = new int[n];
        second[0] = nums[1];
        
        int f = 0;
        int s = 0;

        for(int i = 2; i < n; i++)
            if(first[f] > second[s])
                first[++f] = nums[i];
            else
                second[++s] = nums[i];

        for(int i = 0; i <= f; i++)
            nums[i] = first[i];
        
        for(int i = 0; i <= s; i++)
            nums[f + 1 + i] = second[i];

        return nums;        
    }
}