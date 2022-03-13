public class LeetCode200_2 {
    char[][] grid;
    int h, l;
    int ans = 0;
    boolean[][] used;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        this.used = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (used[i][j] || grid[i][j] == '0')
                    continue;
                dfs(i, j);
                ans++;
            }
        }
        return ans;
    }

    private void dfs(int i, int j) {
        if (i < 0 || i >= h || j < 0 || j >= l || used[i][j] || grid[i][j] == '0')
            return;
        used[i][j] = true;
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}
