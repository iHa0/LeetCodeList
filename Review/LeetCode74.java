class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h = 0, l = matrix[0].length - 1;
        while (h < matrix.length && l >= 0) {
            if (target == matrix[h][l]) return true;
            if (target > matrix[h][l]) h++;
            else l--;
        }
        return false;
    }
}
