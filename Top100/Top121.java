public class Top121 {
    public int maxProfit(int[] prices) {
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1] - prices[i - 1] + prices[i], 0);
            if (dp[i] > max)
                max = dp[i];
        }
        return max;
    }
}
