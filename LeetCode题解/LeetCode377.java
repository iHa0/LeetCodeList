class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int a : nums) {
                if (i >= a) dp[i] += dp[i - a];
            }
        }
        return dp[target];
    }
}
