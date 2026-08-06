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
        int temp = n;
        int d = 0;        
        while(temp>0){
            d = temp % 10;
            product *= d;
            temp /= 10;
        }

        return product;
    }
}