import java.util.Arrays;

public class CodingInterviews42 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] + nums[i] > nums[i]){
                dp[i] = dp[i - 1] + nums[i];
            }else {
                dp[i] = nums[i];
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
