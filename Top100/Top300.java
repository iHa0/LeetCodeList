package Top100;

import java.util.Arrays;

public class Top300 {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return 1;
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }

            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
