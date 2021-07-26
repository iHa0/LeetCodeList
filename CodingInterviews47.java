public class CodingInterviews47 {
    public int maxValue(int[][] grid) {
        int l = grid[0].length, t = grid.length;
        int[][] dp = new int[t][l];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < t; i++){
            for (int j = 0; j < l; j++){
                if (i == 0){
                    if (j == 0)
                        continue;
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                    continue;
                }
                if (j == 0){
                    dp[i][0] = dp[i - 1][0] + grid[i][0];
                    continue;
                }
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[t - 1][l - 1];
    }
}
