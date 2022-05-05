class Solution {
    int h;
    int l;
    int[][] grid;
    int res = 0;
    int temp = 0;
    boolean[][] used;
    public int maxAreaOfIsland(int[][] grid) {
        this.h = grid.length;
        this.l = grid[0].length;
        this.grid = grid;
        this.used = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 0) continue;
                else {
                    area(i, j);
                    res = Math.max(res, temp);
                    temp = 0;
                }
            }
        }
        return res;
    }

    private void area(int i, int j) {
        if (i < 0 || j < 0 || i >= h || j >= l || grid[i][j] == 0 || used[i][j]) return;
        temp++;
        used[i][j] = true;
        area(i - 1, j);
        area(i + 1, j);
        area(i, j - 1);
        area(i, j + 1);
    }
}
