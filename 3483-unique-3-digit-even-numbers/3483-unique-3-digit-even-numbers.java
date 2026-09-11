class Solution {
    public int totalNumbers(int[] digits) {
        int[] available = new int[10];
        for (int d : digits) {
            available[d]++;
        }
        
        int uniqueEvenCount = 0;
        
        // Loop through all valid 3-digit even numbers
        for (int num = 100; num < 1000; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;
            
            int[] required = new int[10];
            required[d1]++;
            required[d2]++;
            required[d3]++;
            
            // Validate if available digits satisfy the requirement
            if (available[d1] >= required[d1] && 
                available[d2] >= required[d2] && 
                available[d3] >= required[d3]) {
                uniqueEvenCount++;
            }
        }
        
        return uniqueEvenCount;
    }
}