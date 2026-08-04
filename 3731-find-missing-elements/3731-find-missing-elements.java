class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int[] arr = new int[101];

        int st = 100;
        int end = 1;

        for(int i:nums){

            arr[i]+=1;

            if(i < st) st = i;

            if(end < i) end = i;
        }

        System.out.println(st+" "+end);
        List<Integer> res = new ArrayList<>();

        for(int i = st; i<=end;i++)
            if(arr[i]==0)
                res.add(i);

        return res;
    }
}