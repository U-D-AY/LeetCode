class Solution {
    int[][] arr;
    public boolean stoneGame(int[] piles) {
        int len = piles.length;

        arr = new int[len][len];

        return findTheLoss(piles, 0, len-1)>0;
    }
    private int findTheLoss(int[] piles,int l,int r){
        if(l>r) return 0;

        if(l == r) return piles[l];

        if(arr[l][r] != 0) return arr[l][r];

        int left = piles[l] - findTheLoss(piles, l+1, r);
        int right = piles[r] - findTheLoss(piles, l, r-1);

        arr[l][r] = Math.max(left, right);
        return arr[l][r];
    }
}