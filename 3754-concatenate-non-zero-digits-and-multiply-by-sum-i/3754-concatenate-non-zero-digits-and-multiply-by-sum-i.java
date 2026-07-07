class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        long con = 0;
        int temp = n;
        int c=0;

        while(temp>0){
            temp/=10;
            c+=1;
        }

        for(int i=1; i<c+1;i++){
            int y = (int)((n/Math.pow(10, c-i))%10);
            if(y==0)
                continue;
            
            con = con * 10 + y;
            sum += y;
        }

        return con*sum;

    }
}