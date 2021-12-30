package TopInterview;

public class TopInterview130 {
    char[][] board;
    int h, l;
    boolean[][] visited;
    public void solve(char[][] board) {
        this.board = board;
        this.h = board.length;
        this.l = board[0].length;
        this.visited = new boolean[h][l];
        for (int i = 1; i < h - 1; i++) {
            for (int j = 1; j < l - 1; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'a';
            }
        }
        for (int i = 0; i < l; i++) {
            if (board[0][i] == 'O')
                search(0,i);
            if (board[h - 1][i] == 'O')
                search(h - 1, i);
        }
        for (int i = 1; i < h - 1; i++) {
            if (board[i][0] == 'O')
                search(i, 0);
            if (board[i][l - 1] == 'O')
                search(i, l - 1);
        }
        for (int i = 1; i < h - 1; i++) {
            for (int j = 1; j < l - 1; j++) {
                if (board[i][j] == 'a')
                    board[i][j] = 'X';
            }
        }
        System.out.println("1");
    }
    
    public void search(int i, int j){
        if (i < 0 || j < 0 || i >= h || j >= l || board[i][j] == 'X' || visited[i][j] == true)
            return;
        if (board[i][j] == 'a')
            board[i][j] = 'O';
        visited[i][j] = true;
        search(i - 1, j);
        search(i + 1, j);
        search(i, j - 1);
        search(i, j + 1);
    }
}
