class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int overlapLeft = Math.max(rec1[0], rec2[0]);
        int overlapRight = Math.min(rec1[2], rec2[2]);
        int overlapBottom = Math.max(rec1[1], rec2[1]);
        int overlapTop = Math.min(rec1[3], rec2[3]);
        
        // If the left boundary is strictly less than the right boundary, 
        // AND the bottom is strictly less than the top, they overlap.
        return overlapLeft < overlapRight && overlapBottom < overlapTop;
    }
}