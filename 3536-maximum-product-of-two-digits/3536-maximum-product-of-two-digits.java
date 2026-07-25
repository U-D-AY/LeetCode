class Solution {
    public int maxProduct(int n) {
        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;

        int d = 0;
        while(n>0){
            d = n%10;

            if(d>x){
                y = x;
                x = d;
            }
            else if(d>y){
                y = d;
            }

            n/=10;
        }

        return x*y;
    }
}