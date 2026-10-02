class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of each ASCII character
        int[] lastSeen = new int[128];
        
        // Initialize all indices to -1 (meaning not seen yet)
        java.util.Arrays.fill(lastSeen, -1);
        
        int maxLength = 0;
        int left = 0; // Left boundary of our sliding window
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If we've seen this character before AND it's inside our current window
            if (lastSeen[currentChar] >= left) {
                // Shrink the window by moving the left pointer right past the duplicate
                left = lastSeen[currentChar] + 1;
            }
            
            // Update the last seen position of the current character
            lastSeen[currentChar] = right;
            
            // Calculate the current window size and update max
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}