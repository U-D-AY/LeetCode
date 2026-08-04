class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] arr = new int[101];

        int st = 100;
        int end = 1;

        for(int i:nums){

            arr[i]+=1;

            st = Math.min(i, st);
            end = Math.max(i, end);
        }

        List<Integer> res = new ArrayList<>();

        for(int i = st+1; i<=end-1;i++)
            if(arr[i]==0)
                res.add(i);

        return res;
    }
}