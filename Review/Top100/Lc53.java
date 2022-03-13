public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        if (len < 2)
            return nums[0];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
