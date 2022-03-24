class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 0;
        for (int i = 0; i < len; i++) {
            int count = nums[i];
            for (int j = i + 1; j < len && j <= i + count; j++) {
                if (dp[j] == 0){
                    dp[j] = dp[i] + 1;
                } else {
                    dp[j] = Math.min(dp[j], dp[i] + 1);
                }
            }
        }
        return dp[len - 1];
    }
}
