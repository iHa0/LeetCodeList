package Review;

public class LeetCode1020 {
    int[][] grid;
    int h, l;
    boolean[][] visited;
    int res = 0;
    int count = 0;
    boolean isEdge = false;
    public int numEnclaves(int[][] grid) {
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 0 || visited[i][j])
                    continue;
                dfs(i, j);
                if (!isEdge){
                    res += count;
                }
                count = 0;
                isEdge = false;
            }
        }
        return res;
    }

    public void dfs(int i, int j){
        if (i < 0 || j < 0 || i >= h || j >= l || visited[i][j] || grid[i][j] == 0)
            return;
        if (i == 0 || j == 0 || i == h - 1 || j == l - 1){
            isEdge = true;
        }
        visited[i][j] = true;
        count++;
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}
