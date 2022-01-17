package TopInterview;

import java.util.Arrays;

public class TopInterview322_2 {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        Arrays.sort(coins);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                else
                    break;
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
