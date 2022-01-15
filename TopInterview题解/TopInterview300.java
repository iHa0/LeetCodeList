package TopInterview;

import java.util.Arrays;

public class TopInterview300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            int index = nums[i];
            for (int j = 0; j < i; j++) {
                if (nums[j] < index)
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
