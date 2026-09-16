class Solution {
    public boolean isPalindrome(int x) {
        // Step 1: Negative numbers are never palindromes (e.g., -121 becomes 121-)
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int reversed = 0;
        
        // Step 2: Reverse the number using math
        while (x != 0) {
            int digit = x % 10;              // Get the last digit
            reversed = reversed * 10 + digit; // Append it to our reversed number
            x /= 10;                         // Remove the last digit from x
        }
        
        // Step 3: Compare the original to the reversed version
        return original == reversed;
    }
}