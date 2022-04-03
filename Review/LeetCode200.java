class Solution {
    private char[][] grid;
    private int h, l;
    private int res = 0;
    private boolean[][] visited;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (visited[i][j] || grid[i][j] == '0') continue;
                back(i, j);
                res++;
            }
        }
        return res;
    }

    private void back(int i, int j) {
        if (i < 0 || i >= h || j < 0 || j >= l || visited[i][j] || grid[i][j] == '0') return;
        visited[i][j] = true;
        back(i - 1, j);
        back(i + 1, j);
        back(i, j - 1);
        back(i, j + 1);
    }
}
