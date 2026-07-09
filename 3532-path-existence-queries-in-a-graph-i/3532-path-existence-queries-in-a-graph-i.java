class Solution {
    private int[] parent;
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        parent = new int[n];
        for(int i=0; i<n;i++)
            parent[i]=i;

        build(nums, maxDiff, n);

        boolean[] res = new boolean[queries.length];
        for(int i=0; i<queries.length;i++){
            res[i] = find(queries[i][0]) == find(queries[i][1]);
        }

        return res;
    }
    private int find(int i){
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent[i]);
    }
    private void build(int[] nums, int maxDiff, int size){
        for(int i=0; i<size - 1; i++){
            if(Math.abs(nums[i] - nums[i+1]) <= maxDiff)
                union(i, i+1);
        }
    }
    private void union(int u, int v){
        int uroot = find(u);
        int vroot = find(v);
        
        if(uroot != vroot)
            parent[vroot] = uroot;
    }
}