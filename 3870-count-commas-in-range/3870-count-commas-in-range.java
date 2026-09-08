class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;
        long threshold = 1000;
        
        // Count how many numbers cross each comma threshold
        while (n >= threshold) {
            totalCommas += (n - threshold + 1);
            threshold *= 1000; // Move to the next comma layer (1,000,000)
        }
        
        return totalCommas;
    }
}