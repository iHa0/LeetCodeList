class Solution {
    char[][] board;
    int h, l, len;
    String word;
    boolean[][] visited;
    boolean res;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.h = board.length;
        this.l = board[0].length;
        this.len = word.length();
        this.word = word;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (board[i][j] == word.charAt(0)) back(i, j, 0);
                if (res) return true;
            }
        }
        return false;
    }

    private void back(int i, int j, int index) {
        if (index == len) res = true;
        if (i < 0 || i >= h || j < 0 || j >= l || visited[i][j] || res || board[i][j] != word.charAt(index)) return;
        visited[i][j] = true;
        back(i - 1, j, index + 1);
        back(i + 1, j, index + 1);
        back(i, j - 1, index + 1);
        back(i, j + 1, index + 1);
        visited[i][j] = false;
    }
}
