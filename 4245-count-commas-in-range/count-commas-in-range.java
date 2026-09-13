class Solution {
    public int countCommas(int n) {
        int commas = 0;
        
        // Every number from 1,000 to n gets at least 1 comma
        if (n >= 1000) {
            commas += n - 999;
        }
        
        // Every number from 1,000,000 to n gets a 2nd comma
        if (n >= 1000000) {
            commas += n - 999999;
        }
        
        // Every number from 1,000,000,000 to n gets a 3rd comma
        if (n >= 1000000000) {
            commas += n - 999999999;
        }
        
        return commas;
    }
}