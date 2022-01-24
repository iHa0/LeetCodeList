package TopInterview;

public class TopInterview289 {
    int h, l;
    int[][] board;
    int[][] oldBoard;
    public void gameOfLife(int[][] board) {
        this.h = board.length;
        this.l = board[0].length;
        this.board = board;
        this.oldBoard = new int[h + 2][l + 2];

        for (int i = 0; i <= h + 1; i++) {
            for (int j = 0; j <= l + 1; j++) {
                if (i == 0 || i == h + 1 || j == 0 || j == l + 1){
                    oldBoard[i][j] = 0;
                    continue;
                }
                oldBoard[i][j] = board[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                int num = count(i, j);
                if (oldBoard[i][j] == 1){
                    if (num < 2)
                        board[i - 1][j - 1] = 0;
                    if (num == 2 || num == 3)
                        continue;
                    if (num > 3)
                        board[i - 1][j - 1] = 0;
                } else {
                    if (num == 3)
                        board[i - 1][j - 1] = 1;
                }
            }
        }
    }

    public int count(int i, int j){
        int count = 0;
        count += oldBoard[i - 1][j - 1] + oldBoard[i - 1][j] + oldBoard[i - 1][j + 1] +
                    oldBoard[i][j - 1] + oldBoard[i][j + 1] + oldBoard[i + 1][j - 1] +
                    oldBoard[i + 1][j] + oldBoard[i + 1][j + 1];
        return count;
    }
}
