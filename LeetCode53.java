import java.util.Arrays;

public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
