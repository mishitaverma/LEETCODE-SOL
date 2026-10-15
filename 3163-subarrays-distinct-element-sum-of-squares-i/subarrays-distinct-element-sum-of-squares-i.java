import java.util.HashSet;
import java.util.List;

class Solution {
    public int sumCounts(List<Integer> nums) {
        // Step 1: A bucket to hold our grand total score
        int grandTotal = 0;
        
        // Step 2: The outer loop picks where our picture STARTS
        for (int i = 0; i < nums.size(); i++) {
            
            // Step 3: We need a fresh, blank notebook for every new starting point!
            HashSet<Integer> notebook = new HashSet<>();
            
            // Step 4: The inner loop stretches the picture to the RIGHT
            for (int j = i; j < nums.size(); j++) {
                
                // Add the new sticker to our picture/notebook
                notebook.add(nums.get(j));
                
                // Count how many unique stickers are currently in the notebook
                int uniqueCount = notebook.size();
                
                // Square the count and add it to our grand total
                grandTotal = grandTotal + (uniqueCount * uniqueCount);
            }
        }
        
        // Step 5: Hand in the final score!
        return grandTotal;
    }
}