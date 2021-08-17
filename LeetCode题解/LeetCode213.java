import java.util.Arrays;

public class LeetCode213 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        if (len == 2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[len];
        int[] dp2 = new int[len - 1];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp2[0] = nums[1];
        dp2[1] = nums[2];
        if (len == 3){
            dp[2] = nums[2];
            return Arrays.stream(dp).max().getAsInt();
        }
        for (int i = 2; i < len; i++) {
            int[] temp = null;
            temp = Arrays.copyOfRange(dp, 0, i - 1);
            int max = Arrays.stream(temp).max().getAsInt();
            dp[i] = max + nums[i];
        }
        for (int i = 2; i < len - 1; i++) {
            int[] temp = null;
            temp = Arrays.copyOfRange(dp2, 0, i - 1);
            int max = Arrays.stream(temp).max().getAsInt();
            dp2[i] = max + nums[i + 1];
        }
        dp[len - 1] = dp2[len - 2];

        return Arrays.stream(dp).max().getAsInt();
    }
}
