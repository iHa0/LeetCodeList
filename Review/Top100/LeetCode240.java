class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h = matrix.length, l = matrix[0].length;
        int x = 0, y = l - 1;
        while (x < h && y >= 0) {
            if (x > h || y < 0) return false;
            if (x < h && y >= 0 && matrix[x][y] == target) return true;
            if (x < h && y >= 0 && matrix[x][y] > target) y--;
            if (x < h && y >= 0 && matrix[x][y] < target) x++;
        }
        return false;
    }
}
