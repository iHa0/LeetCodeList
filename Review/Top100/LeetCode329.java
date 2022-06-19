class Solution {
    int[][] matrix;
    int len, h, l;
    int[][] dp;
    int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        this.h = matrix.length;
        this.l = matrix[0].length;
        this.dp = new int[h][l];
        int res = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                res = Math.max(res, back(i, j));
            }
        }
        return res;
    }

    private int back(int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];
        dp[i][j]++;
        for (int[] dir : dirs) {
            int newi = i + dir[0];
            int newj = j + dir[1];
            if (newi >= 0 && newi < h && newj >= 0 && newj < l && matrix[newi][newj] > matrix[i][j]) {
                dp[i][j] = Math.max(dp[i][j], back(newi, newj) + 1);
            }
        }
        return dp[i][j];
    }
}
