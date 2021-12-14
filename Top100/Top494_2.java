package Top100;

public class Top494_2 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n :
                nums) {
            sum += n;
        }
        if (sum + target < 0|| (sum + target) % 2 == 1)
            return 0;
        return subsets(nums, (sum + target) / 2);
    }
    public int subsets(int[] nums, int sum){
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (j >= nums[i - 1]){
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                }else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][sum];
    }
}
