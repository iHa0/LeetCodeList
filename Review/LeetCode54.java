class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int h = matrix.length, l = matrix[0].length, th = Math.min(h, l);
        int cycle = th % 2 == 1 ? th / 2 + 1 : th / 2;
        List<Integer> res = new ArrayList<>();
        for (int c = 0; c < cycle; c++) {
            int i = c, j = c;
            while (j < l - c) {
                res.add(matrix[i][j++]);
            }
            i++;
            j--;
            if (i >= h - c) break;
            while (i < h - c) {
                res.add(matrix[i++][j]);
            }
            i--;
            j--;
            if (j < c) break;
            while(j >= c) {
                res.add(matrix[i][j--]);
            }
            i--;
            j++;
            if (i <= c) break;
            while (i > c) {
                res.add(matrix[i--][j]);
            }
        }
        return res;
    }
}
