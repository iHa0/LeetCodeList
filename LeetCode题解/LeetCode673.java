class Solution {
    public int findNumberOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[] dp = new int[len];
        int[] count = new int[len];
        Arrays.fill(dp, 1);
        Arrays.fill(count, 1);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        count[i] = count[j];
                    } else if (dp[j] + 1 == dp[i]) {
                        count[i] += count[j];
                    }
                }
            }
        }
        int res = 0, max = 0;
        for (int a : dp) {
            max = Math.max(max, a);
        }
        for (int i = 0; i < len; i++) {
            if (dp[i] == max) res += count[i];
        }
        return res;
    }
}
