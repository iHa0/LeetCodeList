package TopInterview;


public class TopInterview329 {
    int h, l;
    int[][] matrix;
    int[][] memo;
    int[][] dirs = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public int longestIncreasingPath(int[][] matrix) {
        this.h = matrix.length;
        this.l = matrix[0].length;
        this.matrix = matrix;
        this.memo = new int[h][l];
        int ans = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                ans = Math.max(ans, back(i, j));
            }
        }
        return ans;
    }

    private int back(int i, int j) {
        if (memo[i][j] != 0){
            return memo[i][j];
        }
        memo[i][j]++;
        for (int[] dir : dirs) {
            int newi = i + dir[0], newj = j + dir[1];
            if (newi >= 0 && newi < h && newj >= 0 && newj < l && matrix[newi][newj] > matrix[i][j]){
                memo[i][j] = Math.max(memo[i][j], back(newi, newj) + 1);
            }
        }
        return memo[i][j];
    }
}
