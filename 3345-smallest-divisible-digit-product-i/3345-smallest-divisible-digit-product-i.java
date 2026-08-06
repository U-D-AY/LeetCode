class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(getProduct(n)%t==0)
                return n;
            n++;
        }
    }
    private int getProduct(int n){
        
        int product = 1;     
        while(n>0){
            product *= (n%10);
            n /= 10;
        }

        return product;
    }
}