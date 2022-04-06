class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 2;
        if (n == 1) return a;
        if (n == 2) return b;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
