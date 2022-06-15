class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j <i; j++) {
                dp[i] = Math.max(Math.max((i - j) * j, dp[i - j] * j), dp[i]);
            }
        }
        return dp[n];
    }
}
