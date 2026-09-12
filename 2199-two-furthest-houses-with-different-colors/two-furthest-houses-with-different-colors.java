class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;
        
        // Scenario 1: Find the furthest house from the FIRST house (colors[0])
        for (int i = n - 1; i >= 0; i--) {
            if (colors[i] != colors[0]) {
                maxDist = i; // Distance is just 'i - 0'
                break;
            }
        }
        
        // Scenario 2: Find the furthest house from the LAST house (colors[n-1])
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1) - i);
                break;
            }
        }
        
        return maxDist;
    }
}