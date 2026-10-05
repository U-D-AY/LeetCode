class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        
        // Loop through all valid hours (0 to 11)
        for (int hour = 0; hour < 12; hour++) {
            // Loop through all valid minutes (0 to 59)
            for (int min = 0; min < 60; min++) {
                // Count total set bits (1s) in binary representation of hour and minute
                if (Integer.bitCount(hour) + Integer.bitCount(min) == turnedOn) {
                    StringBuilder newTime = new StringBuilder();
                    newTime.append(hour).append(":");
                    
                    // Format minute with a leading zero if less than 10
                    if (min < 10) {
                        newTime.append("0");
                    }
                    newTime.append(min);
                    
                    ans.add(newTime.toString());
                }
            }
        }
        return ans;
    }
}