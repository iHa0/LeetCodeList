package Top100;

public class Top200 {
    int h, l;
    char grid[][];
    int num = 0;
    boolean[][] visited;
    boolean[][] isPass;
    public int numIslands(char[][] grid) {
        this.h = grid.length;
        this.l = grid[0].length;
        this.grid = grid;
        this.visited = new boolean[h][l];
        this.isPass = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (isPass[i][j] == true && grid[i][j] == '1' || grid[i][j] == '0')
                    continue;
                boolean res = search(i, j);
                if (res == true)
                    num++;
            }
        }
        return num;
    }
    public boolean search(int i, int j){
        if (i < 0 || j < 0 || i >= h || j >= l || visited[i][j] || grid[i][j] == '0')
            return true;
        if (isPass[i][j] == true)
            return true;
        visited[i][j] = true;
        isPass[i][j] = true;
        boolean res = search(i - 1, j) && search(i + 1, j) && search(i, j - 1)
                && search(i, j + 1);
        visited[i][j] = false;
        return res;
    }
}
