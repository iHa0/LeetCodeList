package TopInterview;

public class TopInterview378 {
    public int kthSmallest(int[][] matrix, int k) {
        int h = matrix.length, l = matrix[0].length;
        int left = matrix[0][0], right = matrix[h - 1][l - 1];
        while (left < right){
            int mid = left + (right - left) / 2;
            int count = findCount(matrix, mid, h, l);
            if (count < k){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return right;
    }

    public int findCount(int[][] matrix, int mid, int h, int l){
        int i = h - 1, j = 0;
        int count = 0;
        while (i >= 0 && j < l){
            if (mid >= matrix[i][j]){
                count += i + 1;
                j++;
            }else {
                i--;
            }
        }
        return count;
    }
}
