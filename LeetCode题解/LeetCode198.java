import java.util.Arrays;

public class LeetCode198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < len; i++) {
            int[] temp = Arrays.copyOfRange(dp, 0, i - 1);
            int max = Arrays.stream(temp).max().getAsInt();
            dp[i] = max + nums[i];
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}

