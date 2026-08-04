class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] arr = new int[101];

        for(int i:nums)
            arr[i]+=1;
        
        int st = 0;
        int end = 0;
        for(int i = 1; i<=100;i++){
            if(st!=0 && end!=0)
                break;
            if(st==0 && arr[i]>0)
                st = i;
            if(end==0 && arr[101-i]>0){
                end = 101-i;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = st; i<=end;i++)
            if(arr[i]==0)
                res.add(i);

        return res;
    }
}