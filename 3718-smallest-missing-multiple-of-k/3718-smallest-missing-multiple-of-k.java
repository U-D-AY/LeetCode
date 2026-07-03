class Solution {
    public int missingMultiple(int[] nums, int k) {
        int l = nums.length;
        int[] arr = new int[l + 1];

        for(int i=0; i<l; i++){
            // first  if its divisible
            if(nums[i]%k == 0){
                int j = nums[i]/k;

                // At the worst case we will get all elements divisible by k, in that case we just have to return k*l+1
                // if not above statement and we did get somthing a 'j' > l ,that means atleast 1 is missing for (1 to l+1) number which was occupied by this "j" guy.
                if(j<=l){
                    arr[j] = 1;
                }
            }
        }

        for(int i=1; i<l+1; i++){
            if (arr[i]==0)
                return i*k;
        }

        // only when all guys are div's by our 'k' guy, in this case just return (l+1)*k
        return (l+1)*k;
    }
}