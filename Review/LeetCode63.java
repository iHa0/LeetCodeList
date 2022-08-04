class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length, l = obstacleGrid[0].length;
        int[][] dp = new int[h][l];
        for (int i = 0; i < h && obstacleGrid[i][0] == 0; i++) dp[i][0] = 1;
        for (int i = 0; i < l && obstacleGrid[0][i] == 0; i++) dp[0][i] = 1;
        for (int i = 1; i < h; i++) {
            for (int j = 1; j < l; j++) {
                if (obstacleGrid[i][j] == 0) dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[h - 1][l - 1];
    }
}
