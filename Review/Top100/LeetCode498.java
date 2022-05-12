class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int h = mat.length, l = mat[0].length;
        int count = h + l - 1, m = 0, n = 0, index = 0;
        int[] res = new int[h * l];
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                while (m >= 0 && n < l) {
                    res[index++] = mat[m][n];
                    m--;
                    n++;
                }
                if (n < l) {
                    m++;
                } else {
                    m += 2;
                    n--;
                }
            } else {
                while (n >= 0 && m < h) {
                    res[index++] = mat[m][n];
                    m++;
                    n--;
                }
                if (m < h) {
                    n++;
                } else {
                    m--;
                    n += 2;
                }
            }
        }
        return res;
    }
}
