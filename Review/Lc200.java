class Solution {
    char[][] grid;
    int h, l;
    boolean[][] uesd;
    public int numIslands(char[][] grid) {
        this.grid = grid;
        this.h = grid.length;
        this.l = grid[0].length;
        this.uesd = new boolean[h][l];
        int count = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == '0' || uesd[i][j]) continue;
                count++;
                back(i, j);
            }
        }
        return count;
    }

    private void back(int i, int j) {
        if (i < 0 || i >= h || j < 0 || j >= l || uesd[i][j] || grid[i][j] == '0') return;
        uesd[i][j] = true;
        back(i - 1, j);
        back(i + 1, j);
        back(i, j - 1);
        back(i, j + 1);
    }
}
