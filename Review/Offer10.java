class Solution {
    public int numWays(int n) {
        int a = 1, b = 2;
        if (n == 0) return a;
        if (n == 1) return a;
        if (n == 2) return b;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = (a + b) % (int)(1e9 + 7);
            a = b;
            b = sum;
        }
        return sum;
    }
}
