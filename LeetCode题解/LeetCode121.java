import java.util.Arrays;

public class LeetCode121 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0)
            return 0;
        int[] dp = new int[len];
        dp[0] = 0;
        for (int i = 1; i < len; i++) {
            if (prices[i] - prices[i - 1] <= 0) {
                dp[i] = Math.max(0, prices[i] - prices[i - 1] + dp[i - 1]);
            }else {
                dp[i] = prices[i] - prices[i - 1] + dp[i - 1];
            }

        }

        return Arrays.stream(dp).max().getAsInt();
    }
}
