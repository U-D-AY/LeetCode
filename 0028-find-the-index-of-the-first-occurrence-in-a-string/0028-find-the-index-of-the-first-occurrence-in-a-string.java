class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int key = needle.length();

        if(len<key) return -1;

        for(int i=0; i + key <= len; i++){
            if(haystack.substring(i, i + key).equals(needle))
            return i;
        }

        return -1;
    }
}