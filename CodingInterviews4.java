import java.util.Arrays;

public class CodingInterviews4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0 || matrix == null){
            return false;
        }
        int h = matrix.length , l = matrix[0].length , targetH = 0;
        int hh = 0 , ll = l - 1;
        while (ll >= 0 && hh < h){
            int n = matrix[hh][ll];
            if (n == target){
                return true;
            }else if (n > target){
                ll--;
            }else {
                hh++;
            }
        }
        return false;
    }
}
