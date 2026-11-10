class Solution { 
    public int climbStairs(int n, int[] costs) { 
        // Handle edge cases where no steps are taken
        if (n <= 0 || costs == null || costs.length == 0) {
            return 0;
        }
        
        int s4 = 0; // Fixed: Initialized to prevent compilation error
        int s1 = 0, s2 = 0, s3 = 0; 
        
        // Ensure we don't exceed the bounds of the costs array
        int steps = Math.min(n, costs.length);
        
        for (int i = 0 ; i < steps ; ++i) { 
            s4 = Math.min(1 + costs[i] + s3, 
                 Math.min(4 + costs[i] + s2, 
                          9 + costs[i] + s1)); 
            
            // Shift states forward
            s1 = s2; 
            s2 = s3; 
            s3 = s4; 
        } 
        
        return s4; 
    } 
}
