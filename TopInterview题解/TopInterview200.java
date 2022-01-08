package TopInterview;

public class TopInterview200 {
    char[][] grid;
    int h, l, count;
    boolean[][] visited;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        count = 0;
        visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (visited[i][j] == true || grid[i][j] == '0')
                    continue;
                dfs(i, j);
                count++;
            }
        }
        return count;
    }

    public void dfs(int i, int j){
        if (i < 0 || j < 0 || i >= h || j >= l || grid[i][j] == '0' || visited[i][j] == true)
            return;
        visited[i][j] = true;
        dfs(i - 1, j);
        dfs(i + 1, j);
        dfs(i, j - 1);
        dfs(i, j + 1);
    }
}
