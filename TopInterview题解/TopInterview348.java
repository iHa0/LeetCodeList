package TopInterview;

public class TopInterview348 {
    int[][] board;
    int n;
    int left = 0, right = 0;
    public TopInterview348(int n) {
        this.board = new int[n + 1][n + 1];
        this.n = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 0;
            }
        }
    }

    public int move(int row, int col, int player) {
        int num = player == 1 ? 1 : -1;
        board[row][col] = num;
        for (int i = 0; i < n; i++) {
            left += board[i][i];
            right += board[n - i - 1][i];
        }
        if (left == n || left == -n || right == n || right == -n)
            return player;
        left = 0;
        right = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][n] += board[i][j];
                board[n][j] += board[i][j];
                if (board[i][n] == n || board[i][n] == -n || board[n][j] == n || board[n][j] == -n)
                    return player;
            }
        }
        for (int i = 0; i < n; i++) {
            board[i][n] = 0;
            board[n][i] = 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        TopInterview348 topInterview348 = new TopInterview348(3);
        System.out.println(topInterview348.move(0,0,1));
        System.out.println(topInterview348.move(0,2,2));
        System.out.println(topInterview348.move(2,2,1));
        System.out.println(topInterview348.move(1,1,2));
        System.out.println(topInterview348.move(2,0,1));
        System.out.println(topInterview348.move(1,0,2));
        System.out.println(topInterview348.move(2,1,1));
    }
}
