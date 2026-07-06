import java.util.Arrays;

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // 1. Sort: Ascending by start time. If starts are equal, descending by end time.
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // Descending by end
            }
            return a[0] - b[0]; // Ascending by start
        });
        
        int remainingCount = 0;
        int currentEnd = 0;
        
        // 2. Iterate and track the furthest end point seen so far
        for (int[] interval : intervals) {
            int end = interval[1];
            
            // If the current interval extends further, it is NOT covered
            if (end > currentEnd) {
                remainingCount++;
                currentEnd = end; // Update the boundary of the covering interval
            }
        }
        
        return remainingCount;
    }
}