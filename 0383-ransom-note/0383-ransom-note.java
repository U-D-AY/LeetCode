class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCounts = new int[26];
        
        // Count frequencies in the magazine
        for (char c : magazine.toCharArray()) {
            charCounts[c - 'a']++;
        }
        
        // Match the ransom note against available counts
        for (char c : ransomNote.toCharArray()) {
            if (--charCounts[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}