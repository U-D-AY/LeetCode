class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int len = s.length();
        int[] arr = new int[len];

        int id=0;
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '1'){
                arr[id++] = i;
            }
        }

        if (id == 0 || id<k) return "";

        int min = len;
        int x = 0;
        int y = 0;
        for(int i = 0; i < id - k + 1 ; i++){
            int val = arr[i+k-1] - arr[i];
            if(val<min){
                min = val;
                x = i;
                y = i + k -1;
            }
            else if(val == min){
                if(s.substring(arr[x], arr[y] + 1).compareTo(s.substring(arr[i], arr[i+k-1] + 1)) > 0){
                    x = i;
                    y = i+ k - 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+" " + x + " "+ y );
        return s.substring(arr[x], arr[y] + 1);

    }
}