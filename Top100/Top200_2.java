package Top100;

public class Top200_2 {
    int h, l;
    char[][] grid;
    int num = 0;
    public int numIslands(char[][] grid) {
        this.h = grid.length;
        if (h <= 0)
            return 0;
        this.l = grid[0].length;
        this.grid = grid;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == '1'){
                    num++;
                    dfs(i, j);
                }

            }
        }
        return num;
    }
    public void dfs(int i, int j){
        if (i < 0 || j < 0 || i >= h || j >= l || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(i + 1, j);
        dfs(i - 1, j);
        dfs(i, j + 1);
        dfs(i, j - 1);
    }
}
