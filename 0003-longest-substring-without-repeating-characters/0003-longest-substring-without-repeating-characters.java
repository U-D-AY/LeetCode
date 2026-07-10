import java.util.HashSet;
import java.util.Set;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans = 0;

        Set<Character> st = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            while(st.contains(c)){
                st.remove(s.charAt(l));
                l++;
            }

            st.add(c);
            ans = Math.max(ans, i-l+1);
        }
    return ans;
    }
}