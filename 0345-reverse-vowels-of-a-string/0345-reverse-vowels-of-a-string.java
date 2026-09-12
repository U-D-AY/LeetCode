class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            // Move pointer i forward until it hits a vowel, staying within bounds
            while (i < j && !isVowel(sb.charAt(i))) {
                i++;
            }

            // Move pointer j backward until it hits a vowel, staying within bounds
            while (i < j && !isVowel(sb.charAt(j))) {
                j--;
            }

            // Swap the vowels using your index access methods
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            // Move pointers forward/backward after the swap to avoid an infinite loop
            i++;
            j--;
        }
        
        return sb.toString();
    }

    // Helper method to cleanly check for both lower and uppercase vowels
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}