class Solution {
    public int gcdOfOddEvenSums(int n) {
        int od = 0;
        int ev = 0;

        for(int i=0;i<2*n; i+=2){
            od+=i;
            ev+=i+1;
        }

        while(od > 0){
            int temp = od;
            od = ev % od;
            ev = temp;
        }

        return ev;
    }
}