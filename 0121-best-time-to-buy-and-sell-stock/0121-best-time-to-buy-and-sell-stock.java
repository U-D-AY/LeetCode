class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int buy = Integer.MAX_VALUE;

        for(int i : prices){
            buy = Math.min(i, buy);

            profit = Math.max(profit, i - buy);
        }

        return profit;
    }
}