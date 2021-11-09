import java.util.Arrays;

public class Top53 {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > dp[i - 1] + nums[i]){
                dp[i] = nums[i];
            }else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
