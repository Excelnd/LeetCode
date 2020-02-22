public class Solution {
    public int climbStairs(int n) {
        int memo[] = new int[n + 1];
        return climbing(0, n, memo);
    }
    
    private int climbing(int i, int n, int memo[]) {
        if (i > n) return 0;        
        if (i == n) return 1;        
        if (memo[i] > 0) return memo[i];
        
        memo[i] = climbing(i + 1, n, memo) + climbing(i + 2, n, memo);
        
        return memo[i];
    }
}
