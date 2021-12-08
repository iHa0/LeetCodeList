package Top100;

public class Top312 {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        int newLen = len + 2;
        int[][] dp = new int[len + 2][len + 2];
        int[] newNums = new int[len + 2];
        newNums[0] = 1;
        newNums[len + 1] = 1;
        for (int i = 0; i < len; i++) {
            newNums[i + 1] = nums[i];
        }
        for (int i = len; i >= 0; i--) {
            for (int j = i + 1; j < newLen; j++) {
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[k][j] + newNums[i] * newNums[j] * newNums[k]);
                }
            }
        }
        return dp[0][newLen - 1];
    }
}
