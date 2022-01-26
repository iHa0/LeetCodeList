package TopInterview;

public class TopInterview308 {
    int h, l;
    int[][] sumMatrix;
    int[][] matrix;
    public TopInterview308(int[][] matrix) {
        this.h = matrix.length;
        this.l = matrix[0].length;
        sumMatrix = new int[h][l];
        this.matrix = matrix;
        for (int i = 0; i < h; i++) {
            int sum = 0;
            for (int j = 0; j < l; j++) {
                sum += matrix[i][j];
                sumMatrix[i][j] = sum;
            }
        }
    }

    public void update(int row, int col, int val) {
        if (row >= h || col >= l || row < 0 || col < 0)
            return;
        matrix[row][col] = val;
        int sum;
        if (col == 0){
            sum = 0;
        }else {
            sum = sumMatrix[row][col - 1];
        }
        for (int i = col; i < l; i++) {
            sum += matrix[row][i];
            sumMatrix[row][i] = sum;
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int leftsum, rightsum = 0;
        if (row1 == 0){
            leftsum = 0;
        }else {
            leftsum = 0;
            for (int i = row1; i <= row2; i++) {
                leftsum += sumMatrix[i][col1 - 1];
            }
        }
        for (int i = row1; i <= row2; i++) {
            rightsum += sumMatrix[i][col2];
        }
        return rightsum - leftsum;
    }
}
