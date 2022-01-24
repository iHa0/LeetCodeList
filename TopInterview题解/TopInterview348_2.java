package TopInterview;

public class TopInterview348 {
    private int left, right;
    private int[] rows;
    private int[] cols;
    private int n;
    public TopInterview348(int n) {
        this.n = n;
        this.rows = new int[n];
        this.cols = new int[n];
    }

    public int move(int row, int col, int player) {
        int num = player == 1 ? 1 : -1;
        rows[row] += num;
        cols[col] += num;
        if (row == col)
            left += num;
        if (col == n - 1 - row)
            right += num;
        if (Math.abs(rows[row]) == n || Math.abs(cols[col]) == n ||
            Math.abs(left) == n || Math.abs(right) == n)
            return player;
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
