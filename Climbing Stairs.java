
class Solution {
    public int climbStairs(int n) {
        climbing(0, n);
    }
    
    private int climbing(int i, int n) {
        if (n == 0) return count;
        if (i == 2) return (i, i+1);
    }
}
