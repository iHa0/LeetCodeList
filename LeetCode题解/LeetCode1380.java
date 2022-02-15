package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int h = matrix.length;
        int l = matrix[0].length;
        int[] hl = new int[l];
        int[] ll = new int[h];
        Arrays.fill(hl, Integer.MIN_VALUE);
        Arrays.fill(ll, Integer.MAX_VALUE);
        int p = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                ll[i] = Math.min(ll[i], matrix[i][j]);
                hl[j] = Math.max(hl[j], matrix[i][j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < h; i++) {
            int a = ll[i];
            for (int j = 0; j < l; j++) {
                if (hl[j] == a)
                    res.add(a);
            }
        }
        return res;
    }
}
