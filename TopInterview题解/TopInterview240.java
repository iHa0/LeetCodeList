package TopInterview;

public class TopInterview240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int h = matrix.length;
        int l = matrix[0].length;
        int i = 0, j = l - 1;
        while (i < h){
            if (i >= h || j < 0)
                return false;
            while (j >= 0){
                if (i >= h || j < 0)
                    return false;
                if (target == matrix[i][j])
                    return true;
                if (target > matrix[i][j]){
                    i++;
                    continue;
                }
                if (target < matrix[i][j]){
                    j--;
                    continue;
                }
            }
        }
        return false;
    }
}
