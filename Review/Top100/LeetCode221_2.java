class Solution {
    public int maximalSquare(char[][] matrix) {
        int h = matrix.length, l = matrix[0].length;
        int[][] dp = new int[h + 1][l + 1];
        int res = 0;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }
        return res * res;
    }
}
