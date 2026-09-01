class Solution {
    public int firstUniqChar(String s) {
        int[] counter = new int[26];

        HashSet<Character> set = new HashSet<>();

        char[] order = new  char[26];
        int[] idx = new int[26];
        int j = 0;
        int id = 0;

        for(char c:s.toCharArray()){
            counter[c - 'a']++;
            if(set.add(c)){
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