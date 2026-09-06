class Solution {
    public char findTheDifference(String s, String t) {
        char s1 = '\u0000';
        char s2 = '\u0000';

        for(char c:s.toCharArray()) s1+=c;
        for(char c:t.toCharArray()) s2+=c;

        return (char) (s2-s1);
    }
}