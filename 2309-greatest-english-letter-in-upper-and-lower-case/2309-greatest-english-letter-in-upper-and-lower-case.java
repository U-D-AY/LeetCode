class Solution {
    public String greatestLetter(String s) {
        char st = ' ';
        int[] low = new int[26];
        int[] up = new int[26];

        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                if(low[Character.toLowerCase(c)-'a'] == 1){
                    if(st < c)
                        st = c;
                }
                up[c-'A'] = 1;
            }
            else{
                if(up[c-'a'] == 1){
                    char x = Character.toUpperCase(c);
                    if(x>st)
                        st = x;
                }
                low[c-'a']=1;
            }
        }

        return st == ' '? "": String.valueOf(st);
    }
}