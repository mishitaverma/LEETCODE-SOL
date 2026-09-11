class Solution {
    public int totalNumbers(int[] digits) {
        // Step 1: Count the frequency of each digit from the input array
        int[] counts = new int[10];
        for (int digit : digits) {
            counts[digit]++;
        }
        
        int total = 0;
        
        // Step 2: Iterate over all possible 3-digit even numbers (100 to 998)
        for (int i = 100; i < 999; i += 2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;
            
            // Temporarily use the digits
            counts[hundreds]--;
            counts[tens]--;
            counts[ones]--;
            
            // Step 3: Check if we have enough of each digit to form 'i'
            if (counts[hundreds] >= 0 && counts[tens] >= 0 && counts[ones] >= 0) {
                total++; // Increment our counter instead of adding to a list
            }
            
            // Backtrack/restore the counts for the next iteration
            counts[hundreds]++;
            counts[tens]++;
            counts[ones]++;
        }
        
        // Step 4: Return the final count
        return total;
    }
}