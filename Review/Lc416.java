class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length, sum = 0;
        for (int a : nums) sum += a;
        if (sum % 2 == 1) return false;
        int target = sum / 2;
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
