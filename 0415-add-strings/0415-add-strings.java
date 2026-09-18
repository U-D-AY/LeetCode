class Solution {
    public String addStrings(String num1, String num2) {
         StringBuilder result = new StringBuilder();
        
        // Pointers starting at the rightmost end of each string
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        // Loop as long as there are digits to process or a carry remains
        while (i >= 0 || j >= 0 || carry > 0) {
            // Extract current digit or 0 if pointer is out of bounds
            // Subtracting '0' converts the char digit to its integer value
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            // Calculate sum and updated carry
            int total = digit1 + digit2 + carry;
            carry = total / 10;
            
            // Append the last digit of the total
            result.append(total % 10);
            
            // Move pointers to the left
            i--;
            j--;
        }
        
        // Reverse because we appended digits from right to left
        return result.reverse().toString();
    }
}