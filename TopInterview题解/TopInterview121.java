package TopInterview;

public class TopInterview121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        int[] dp = new int[len];
        dp[0] = 0;
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(0, dp[i - 1] - prices[i - 1] + prices[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
