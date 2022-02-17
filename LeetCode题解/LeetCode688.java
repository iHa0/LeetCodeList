package Review;

public class LeetCode688 {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] dirs = new int[][]{
                {1,2},{2,1},{1,-2},{2,-1},{-1,2},{-2,1},{-1,-2},{-2,-1}
        };
        double[][][] dp = new double[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = 1;
            }
        }
        for (int p = 1; p <= k; p++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] dir : dirs) {
                        int nx = i + dir[0], ny = j + dir[1];
                        if (nx < 0 || ny < 0 || nx >= n || ny >= n)
                            continue;
                        dp[i][j][p] += dp[nx][ny][p - 1] / 8;
                    }
                }
            }
        }
        return dp[row][column][k];
    }
}
