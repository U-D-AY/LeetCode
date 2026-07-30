class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int sol = 0;

        if (len>8)
            sol+=8;
        else
            return len;

        if (len>16)
            sol += 16;
        else return sol + (len - 8)*2;

        if (len>24)
            sol += 24;
        else return sol + (len - 16)*3;

        return sol + (len - 24)*4;
    }
}