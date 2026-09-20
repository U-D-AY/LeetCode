class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            sum += (Math.abs((int)(s.charAt(i) - 'z')) + 1) * (i+1);
        }
        return sum;
    }
}