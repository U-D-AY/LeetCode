class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int s = 0;
        for(int i:gain){
            s += i;
            if(s>high) high = s;
        }
        return high;
    }
}