public class Top64 {
    public int minPathSum(int[][] grid) {
        int h = grid.length, l = grid[0].length;
        int[][] dp = new int[h][l];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < l; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < h; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < l; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[h - 1][l - 1];
    }
}
