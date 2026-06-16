import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String processStr(String s) {
        
        ArrayList<Character> arr = new ArrayList<>();

        for(int i=0; i < s.length(); i++){
            char j = s.charAt(i);
            if(Character.isLowerCase(j))
                arr.add(j);
            else if(j == '*'){
                if(!arr.isEmpty())
                    arr.remove(arr.size()-1);
            }
            else if(j == '#')
                arr.addAll(arr);
            else if(j == '%')
                Collections.reverse(arr);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char ch:arr)
            sb.append(ch);
        
        String r = sb.toString();
        
        return r;
    }
}