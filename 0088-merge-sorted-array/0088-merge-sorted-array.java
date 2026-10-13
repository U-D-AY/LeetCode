class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] num = new int[m];
        int k = 0;
        int j = 0;
        int z = 0;

        for(int i=0; i < m; i++) num[i] = nums1[i];

        while(k < m || j < n){

            if(j < n && k >= m){
                nums1[z] = nums2[j];
                j++;
                z++;
            }

            else if(j >= n && k < m){
                nums1[z] = num[k];
                k++;
                z++;
            }

            else if(num[k] < nums2[j]){
                nums1[z] = num[k];
                k++;
                z++;
            }

            else{
                nums1[z] = nums2[j];
                j++;
                z++;
            }
            
        }
    }
}