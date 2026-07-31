import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        
        // .getBytes() is highly optimized in modern Java for ASCII strings
        for (byte b : word.getBytes()) {
            arr[b - 'a']++;
        }

        Arrays.sort(arr);

        int sol = 0;
        
        // Iterate backwards directly to save the '25 - i' math on every step
        for (int i = 25; i >= 0; i--) {
            if (arr[i] == 0) break;
            
            sol += arr[i] * ((25 - i) / 8 + 1);
        }

        return sol;
    }
}