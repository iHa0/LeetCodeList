class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int h = mat.length, l = mat[0].length;
        int[] res = new int[h * l];
        int m = 0, n = 0, index = 0;
        int count = h + l - 1;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                while (m >= 0 && n < l) {
                    res[index++] = mat[m][n];
                    m--;
                    n++;
                }
                if (n < l) m++;
                else {
                    m += 2;
                    n--;
                }
            } else {
                while (m < h && n >= 0) {
                    res[index++] = mat[m][n];
                    m++;
                    n--;
                }
                if (m < h) n++;
                else {
                    n += 2;
                    m--;
                }
            }
        }
        return res;
    }
}
