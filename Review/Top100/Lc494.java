class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int len = nums.length, sum = 0;
        for (int a : nums) sum += a;
        if (Math.abs(target) > Math.abs(sum) || (target + sum) % 2 == 1) return 0;
        int tar = (target + sum) / 2;
        int[] dp = new int[tar + 1];
        dp[0] = 1;
        for (int a : nums) {
            for (int i = tar; i >= a; i--) {
                dp[i] += dp[i - a];
            }
        }
        return dp[tar];
    }
}
