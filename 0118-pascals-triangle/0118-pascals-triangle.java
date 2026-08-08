class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        ArrayList<Integer> fr = new ArrayList<>(1);
        fr.add(1);

        res.add(fr);
        fr = null;

        for(int i=1; i<numRows; i++){
            ArrayList<Integer> arr = new ArrayList<>();

            ArrayList<Integer> pre = (ArrayList<Integer>) res.get(i-1);
            pre.add(0,0); pre.add(0);

            for(int j=0; j < pre.size()-1; j++){
                arr.add(pre.get(j)+pre.get(j+1));
            }
            
            pre.remove(pre.size() - 1);
            pre.remove(0);

            res.add(arr);          
        }
        return res;
    }
}