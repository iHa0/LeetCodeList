import java.util.Arrays;

public class LeetCode300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = Arrays.stream(dp).max().getAsInt();
        return res;
    }
}
