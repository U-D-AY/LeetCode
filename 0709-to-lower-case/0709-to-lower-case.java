class Solution {
    public String toLowerCase(String s) {
         char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            // Check if character is an uppercase letter ('A' to 'Z')
            if (c[i] >= 'A' && c[i] <= 'Z') {
                // Convert to lowercase by adding the ASCII difference
                c[i] = (char) (c[i] - 'A' + 'a');
            }
        }
        return new String(c);
    }
}