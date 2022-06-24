class Solution {
    public double myPow(double x, int n) {
        return n > 0 ? dfs(x, n) : 1 / dfs(x, n);
    }

    private double dfs(double x, int n) {
        if (n == 0) return 1.0;
        double res = dfs(x, n / 2);
        return n % 2 == 0 ? res * res : res * res * x;
    }
}
