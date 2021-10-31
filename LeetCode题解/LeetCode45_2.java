import java.util.Arrays;

public class LeetCode45_2 {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 100000);
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                dp[j] = Math.min(dp[i] + 1, dp[j]);
            }
        }
        return dp[nums.length - 1];
    }
}
