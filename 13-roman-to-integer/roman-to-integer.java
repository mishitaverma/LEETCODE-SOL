class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        
        // Iterate through the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = 0;
            
            // Map the Roman character to its integer value
            switch(s.charAt(i)) {
                case 'I': current = 1; break;
                case 'V': current = 5; break;
                case 'X': current = 10; break;
                case 'L': current = 50; break;
                case 'C': current = 100; break;
                case 'D': current = 500; break;
                case 'M': current = 1000; break;
            }
            
            // If the current value is less than the previous value, subtract it (e.g., IV)
            if (current < prev) {
                sum -= current;
            } else {
                // Otherwise, add it to the sum (e.g., VI)
                sum += current;
            }
            
            // Update prev for the next iteration
            prev = current;
        }
        
        return sum;
    }
}