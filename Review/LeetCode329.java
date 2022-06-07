class Solution {
    int[][] matrix;
    int h, l;
    int[][] memo;
    int[][] dir = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int longestIncreasingPath(int[][] matrix) {
        this.matrix = matrix;
        this.h = matrix.length;
        this.l = matrix[0].length;
        this.memo = new int[h][l];
        int res = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                res = Math.max(res, dfs(i, j));
            }
        }
        return res;
    }

    private int dfs(int i, int j) {
        if (memo[i][j] != 0) return memo[i][j];
        memo[i][j]++;
        for (int[] cp : dir) {
            int newi = i + cp[0], newj = j + cp[1];
            if (newi >= 0 && newi < h && newj >= 0 && newj < l && matrix[newi][newj] > matrix[i][j]) {
                memo[i][j] = Math.max(memo[i][j], dfs(newi, newj) + 1);
            }
        }
        return memo[i][j];
    }
}
