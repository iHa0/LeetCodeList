package TopInterview;

public class TopInterview79 {
    int h, l;
    String word;
    boolean[][] visited;
    boolean flag = false;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        this.h = board.length;
        this.l = board[0].length;
        this.word = word;
        this.board = board;
        this.visited = new boolean[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                boolean res = search(i, j, 0);
                if (res)
                    return true;
            }
        }
        return false;
    }
    public boolean search(int i, int j, int index){
        if (index == word.length() || flag == true){
            flag = true;
            return true;
        }
        if (i < 0 || j < 0 || i >= h || j >= l || visited[i][j] || board[i][j] != word.charAt(index))
            return false;
        visited[i][j] = true;
        boolean res  = search(i - 1, j, index + 1) || search(i + 1, j, index + 1) ||
                search(i, j - 1, index + 1) || search(i, j + 1, index + 1);
        visited[i][j] = false;
        return res;
    }
}
