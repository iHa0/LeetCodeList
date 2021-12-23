package TopInterview;

import java.util.LinkedList;
import java.util.List;

public class TopInterview54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int h = matrix.length, l = matrix[0].length;
        int min = Math.min(h, l);
        int cycle = min % 2 == 1 ? min / 2 + 1 : min / 2;
        List<Integer> res = new LinkedList<>();
        int i = 0, j = 0;
        int si = 0, sj = 0;
        for (int c = 0; c < cycle; c++) {
            i = si;
            j = sj;
            while (j < l - sj){
                res.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            if (i >= h - si)
                break;
            while (i < h - si){
                res.add(matrix[i][j]);
                i++;
            }
            j--;
            i--;
            if (j < sj)
                break;
            while (j >= sj){
                res.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            if (i <= si)
                break;
            while (i > si){
                res.add(matrix[i][j]);
                i--;
            }
            si++;
            sj++;
        }
        return res;
    }
}
