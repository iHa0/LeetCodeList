public class Top48 {
    public void rotate(int[][] matrix) {
        int len = matrix.length, temp = 0;
        for (int i = 0; i < (len % 2 == 0? len / 2: len / 2 + 1); i++) {
            for (int j = i; j < len - i - 1; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[len - j - 1][i];
                matrix[len - j - 1][i] = matrix[len - i - 1][len - j - 1];
                matrix[len - i - 1][len - j - 1] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }
}
