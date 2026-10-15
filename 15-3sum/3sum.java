import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Create a master binder to hold all our winning teams
        List<List<Integer>> winningTeams = new ArrayList<>();
        
        // Step 2: Line up the players from lowest to highest
        Arrays.sort(nums);
        
        // Step 3: Walk down the line picking Captains
        for (int i = 0; i < nums.length - 2; i++) {
            
            // If this Captain has the exact same power as the last one, skip them!
            // We don't want to write down identical duplicate teams.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }
            
            // Step 4: Set up the two scouts
            int left = i + 1;             // Starts right next to the Captain
            int right = nums.length - 1;  // Starts at the very end of the line
            
            // Step 5: The scouts search until they bump into each other
            while (left < right) {
                int teamPower = nums[i] + nums[left] + nums[right];
                
                if (teamPower == 0) {
                    // We found a perfectly balanced team! Write it in the binder.
                    winningTeams.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Move both scouts inward to look for another team for this Captain
                    left++;
                    right--;
                    
                    // Skip over duplicate players so we don't record the same team twice
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } 
                else if (teamPower < 0) {
                    // Team is too negative. Move the left scout up for a bigger number.
                    left++;
                } 
                else {
                    // Team is too positive. Move the right scout down for a smaller number.
                    right--;
                }
            }
        }
        
        return winningTeams;
    }
}