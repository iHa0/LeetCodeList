public class LeetCode746 {
  
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len == 0)
            return 0;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i-1], dp[i - 2]) + cost[i];
        }
        if (dp[len - 1] > dp[len - 2]){
            return dp[len - 2];
        }else {
            return dp[len - 1];
        }
    }
}
