class Solution {
    public int firstUniqChar(String s) {
        int[] counter = new int[26];

        char[] order = new  char[26];
        int[] idx = new int[26];
        int j = 0;
        int id = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            counter[c - 'a']++;
            if(counter[c - 'a'] == 1){
                order[id] = c;
                idx[id++] = j;
            }
            j++;
        }
        
        for(int i = 0; i<id; i++)
            if (counter[order[i] - 'a'] == 1)
                return idx[i];
        
        return -1;
    }
}