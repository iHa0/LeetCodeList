import java.util.Arrays;

public class LeetCode918 {
    public int maxSubarraySumCircular(int[] nums) {
        int len = nums.length, flag = 0, i, sum = 0;
        if (len == 1)
            return nums[0];
        if (len == 2){
            int max_2 = Math.max(nums[0], nums[1]);
            return Math.max(max_2, nums[0] + nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        sum += nums[0];
        for (i = 1; i < len; i++) {
            sum += nums[i];
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }
        int max = Arrays.stream(dp).max().getAsInt();
        for (int j = 1; j < len - 1; j++) {
            dp[j] = Math.min(0, dp[j - 1]) + nums[j];
        }
        int[] temp = Arrays.copyOfRange(dp, 1, len - 1);
        int min = Arrays.stream(temp).min().getAsInt();
        return Math.max(sum - min, max);
    }
}
