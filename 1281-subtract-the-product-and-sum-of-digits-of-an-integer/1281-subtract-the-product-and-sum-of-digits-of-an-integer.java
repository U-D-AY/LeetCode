class Solution {
    public int subtractProductAndSum(int n) {
        int s = 0;
        int p = 1;
        while(n>0){
            int x = n%10;
            s += x;
            p = p*x;
            n = n/10;
        }
        return (p - s);
    }
}