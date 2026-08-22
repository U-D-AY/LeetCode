class Solution {
    public boolean checkDivisibility(int n) {
        if (n<=0) return false;

        int num = n;
        int sum = 0;
        int product = 1;
        int d = 0;
        while(num>0){
            d = num%10;
            sum += d;
            product *= d;
            num /= 10;
        }

        return (n % (sum + product)) == 0;
    }
}