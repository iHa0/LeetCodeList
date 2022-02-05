package Review;

public class LeetCode1219 {
    int res;
    boolean visited[][];
    int h, l;
    int[][] grid;
    int max;
    public int getMaximumGold(int[][] grid) {
        this.max = Integer.MIN_VALUE;
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 0)
                    continue;
                int temp = dfs(i, j, 0, Integer.MIN_VALUE);
                max = Math.max(temp, max);
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }

    private int dfs(int i, int j, int count, int max) {
        if (i < 0 || j < 0 || i >= h || j >= l || grid[i][j] == 0 || visited[i][j])
            return 0;
        count += grid[i][j];
        visited[i][j] = true;
        dfs(i + 1, j, count, max);
        dfs(i - 1, j, count, max);
        dfs(i, j + 1, count, max);
        dfs(i, j - 1, count, max);
        max = Math.max(max, count);
        visited[i][j] = false;
        res = Math.max(max, res);
        return res;
    }
}

