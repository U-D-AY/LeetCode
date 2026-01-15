class Solution {
    public int maxArea(int[] height) {
        int maxa = 0,i=0,j=height.length-1,area=0,minval=0;
        while(i<j){
            area=0;
            minval = Math.min(height[i],height[j]);
            area = minval*(j-i);
            if(maxa<area)
                maxa=area;
            if(minval==height[i])
                i++;
            else
                j--;
        }
        return maxa;
    }
}