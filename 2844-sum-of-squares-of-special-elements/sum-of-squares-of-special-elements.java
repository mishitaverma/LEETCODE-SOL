class Solution {
    public int sumOfSquares(int[] nums) {
        // Step 1: Find out exactly how many chests we have total (n)
        int n = nums.length;
        
        // Step 2: A bucket to hold our grand prize coins
        int grandTotal = 0;
        
        // Step 3: Walk down the line of chests, counting from 1 to n
        for (int i = 1; i <= n; i++) {
            
            // Step 4: The Modulo check! Does 'n' divide by 'i' perfectly?
            if (n % i == 0) {
                
                // Grab the coins from the chest (remembering the computer starts at 0)
                int coins = nums[i - 1];
                
                // Square the coins and add them to our prize bucket
                grandTotal = grandTotal + (coins * coins);
            }
        }
        
        // Step 5: Hand in the final prize bucket!
        return grandTotal;
    }
}