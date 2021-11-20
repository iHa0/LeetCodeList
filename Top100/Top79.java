public class Top79 {
    int h, l, index;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        h = board.length;
        l = board[0].length;
        visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                boolean res = isExist(i, j, 0, board, word);
                if (res)
                    return true;
            }
        }

        return false;
    }
    public boolean isExist(int i, int j, int index, char[][] board, String word){
        if (index >= word.length())
            return true;
        if (i < 0 || j < 0 || i >= h || j >= l || board[i][j] != word.charAt(index) || visited[i][j] == true)
            return false;
        visited[i][j] = true;
        boolean res = isExist(i + 1, j, index + 1, board, word) || isExist(i - 1, j, index + 1, board, word) || isExist(i, j + 1, index + 1, board, word) || isExist(i, j - 1, index + 1, board, word);
        visited[i][j] = false;
        return res;
    }
}
