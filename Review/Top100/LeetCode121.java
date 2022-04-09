class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], prices[i] - dp[i - 1][1]);
            dp[i][1] = Math.min(prices[i], dp[i - 1][1]);
        }
        return dp[len - 1][0];
    }
}
