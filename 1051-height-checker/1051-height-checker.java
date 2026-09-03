class Solution {
    public int heightChecker(int[] heights) {
         int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }
        
        int mismatches = 0;
        int currentHeight = 1;
        
        for (int h : heights) {
            // Find the next available height that should be in this position
            while (count[currentHeight] == 0) {
                currentHeight++;
            }
            
            // If the actual height doesn't match the expected height, count it
            if (h != currentHeight) {
                mismatches++;
            }
            
            // Use up one instance of this height
            count[currentHeight]--;
        }
        
        return mismatches;
    }
}