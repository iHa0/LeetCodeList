class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int h = mat.length, l = mat[0].length;
        int[] res = new int[h * l];
        int count = h + l - 1;
        int m = 0, n = 0, index = 0;
        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) {
                while (m >= 0 && n < l) {
                    res[index++] = mat[m][n];
                    m--;
                    n++;
                }
                if (n >= l) {
                    m += 2;
                    n--;
                } else m++;
            } else {
                while (m < h && n >= 0) {
                    res[index++] = mat[m][n];
                    m++;
                    n--;
                }
                if (m >= h) {
                    m--;
                    n += 2;
                } else {
                    n++;
                }
            }
        }
        return res;
    }
}
