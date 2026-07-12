import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr1 =  arr.clone();
        Arrays.sort(arr1);
        int le = arr.length;

        Map<Integer,Integer> map =new  HashMap<>();

        int idx=1;
        for(int i=0;i<le;i++){
            if(!map.containsKey(arr1[i]))
                map.put(arr1[i], idx++);
        }

        int[] res=new int[le];
        for(int i=0;i<le;i++){
            res[i] = map.get(arr[i]);
        }

        return res;

    }
}