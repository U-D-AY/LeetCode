import java.util.Arrays;
class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];

        for(int i = 0; i < word.length(); i++) 
            arr[word.charAt(i) - 'a']++;

        
        Arrays.sort(arr);

        int sol = 0;

        for(int i=0; i<26; i++){
            if (arr[25-i]==0) break;
            sol = sol +  arr[25-i]*(i/8 + 1);
        }

        return sol;
    }
}