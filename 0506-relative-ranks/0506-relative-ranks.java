class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on score values in descending order
        Arrays.sort(indices, (a, b) -> score[b] - score[a]);

        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[indices[i]] = "Gold Medal";
            } else if (i == 1) {
                ans[indices[i]] = "Silver Medal";
            } else if (i == 2) {
                ans[indices[i]] = "Bronze Medal";
            } else {
                ans[indices[i]] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}