class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < len; j++) {
                if (coins[j] <= i)
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                else
                    break;
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
