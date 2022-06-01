class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0, target = 0;
        for (int i = 0; i < len; i++) sum += nums[i];
        if (sum % 2 == 1) return false;
        else target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int a : nums) {
            for (int i = target; i >= a; i--) {
                dp[i] = dp[i] || dp[i - a];
            }
        }
        return dp[target];
    }
}
