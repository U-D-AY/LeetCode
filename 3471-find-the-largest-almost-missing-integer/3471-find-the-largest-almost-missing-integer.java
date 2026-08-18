class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k<=0 || n<=0) return -1;

        int[] res = new int[51];
        HashSet<Integer> st = new HashSet<>(k);

        for(int i=0; i<n - k + 1; i++){
            for(int j=i; j<i+k; j++){
                int x= nums[j];
                if(!st.contains(x)){
                    res[x]++;
                    st.add(x);
                }
            }
            st.clear();
        }
            
            
        
        int max = -1;
        for(int i=0; i<51; i++)
            if(res[i]==1 && i>max)
                max = i;
        
        return max;

    }
}