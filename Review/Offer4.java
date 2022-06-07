class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int h = matrix.length;
        if (h == 0) return false;
        int l = matrix[0].length;
        int m = 0, n = l - 1;
        while (m < h && n >= 0) {
            if (matrix[m][n] > target) {
                n--;
            } else if (matrix[m][n] < target) {
                m++;
            } else return true;
        }
        return false;
    }
}
