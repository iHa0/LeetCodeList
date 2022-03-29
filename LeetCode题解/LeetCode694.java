class Solution {
    int h, l;
    int[][] grid;
    Set<String> set = new HashSet<>();
    public int numDistinctIslands(int[][] grid) {
        this.h = grid.length;
        this.l = grid[0].length;
        this.grid = grid;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (grid[i][j] == 0) continue;
                StringBuilder sb = new StringBuilder();
                back(i, j, sb);
                set.add(sb.toString());
            }
        }
        return set.size();
    }

    private void back(int i, int j, StringBuilder sb) {
        if (i < 0 || j < 0 || i >= h || j >= l || grid[i][j] == 0) return;
        grid[i][j] = 0;
        back(i - 1, j, sb.append("d"));
        back(i + 1, j, sb.append("u"));
        back(i, j - 1, sb.append("l"));
        back(i, j + 1, sb.append("r"));
    }
}
