class Solution {
    char[][] board;
    String word;
    int len, h, l;
    boolean flag;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.len = word.length();
        this.h = board.length;
        this.l = board[0].length;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                boolean res = dfs(i, j, 0);
                if (res) return true;
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index) {
        if (index == len || flag) return true;
        if (i < 0 || i >= h || j < 0 || j >= l || visited[i][j] || board[i][j] != word.charAt(index)) return false;
        visited[i][j] = true;
        boolean res = dfs(i - 1, j, index + 1) || dfs(i + 1, j, index + 1) || dfs(i, j - 1, index + 1) || dfs(i, j + 1, index + 1);
        visited[i][j] = false;
        return res;
    }
}
