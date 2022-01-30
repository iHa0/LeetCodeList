package Review;

public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int count = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int num = 1, end = n * n;
        for (int i = 0; i < count; i++) {
            for (int j = i; j < n - i; j++) {
                res[i][j] = num++;
                if (num == end)
                    break;
            }
            for (int j = i + 1; j <= n - i - 1; j++) {
                res[j][n - i - 1] = num++;
                if (num == end)
                    break;
            }
            for (int j = n - i - 2; j >= i ; j--) {
                res[n - i - 1][j] = num++;
                if (num == end)
                    break;
            }
            for (int j = n - i - 2; j > i; j--) {
                res[j][i] = num++;
                if (num == end)
                    break;
            }
        }
        return res;
    }
}
