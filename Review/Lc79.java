class Solution {
    char[][] board;
    String word;
    int h, l, len;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.h = board.length;
        this.l = board[0].length;
        this.len = word.length();
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                boolean res = back(i, j, 0);
                if (res) return true;
            }
        }
        return false;
    }

    private boolean back(int i, int j, int index) {
        if (index == len) return true;
        if (i < 0 || i >= h || j < 0 || j >= l || visited[i][j] || word.charAt(index) != board[i][j]) return false;
        visited[i][j] = true;
        boolean res = back(i - 1, j, index + 1) || back(i + 1, j, index + 1) || back(i, j - 1, index + 1) || back(i, j + 1, index + 1);
        visited[i][j] = false;
        return res;
    }
}
