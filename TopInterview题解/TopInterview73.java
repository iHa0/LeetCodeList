package TopInterview;

import java.util.HashSet;

public class TopInterview73 {
    public void setZeroes(int[][] matrix) {
        int h = matrix.length, l = matrix[0].length;
        HashSet<Integer> setl = new HashSet<>();
        HashSet<Integer> seth = new HashSet<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] == 0){
                    seth.add(i);
                    setl.add(j);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (seth.contains(i) || setl.contains(j))
                    matrix[i][j] = 0;
            }
        }
    }
}
