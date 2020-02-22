class Solution {
    public int climbStairs(int n) {
        return climbing(0, n);
    }
    
    private int climbing(int i, int n) {
        if (i > n) 
            return 0;
        
        if (i == n) 
            return 1;
        
        return climbing(i + 1, n) + climbing(i + 2, n);
    }
}
