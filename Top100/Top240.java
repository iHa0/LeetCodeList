package Top100;

public class Top240 {
    int[][] matrix;
    boolean falg;
    int target, h, l;
    public boolean searchMatrix(int[][] matrix, int target) {
        this.matrix = matrix;
        this.h = matrix.length;
        this.l = matrix[0].length;
        this.falg = false;
        this.target = target;
        search(0, matrix[0].length - 1);
        return falg;
    }

    public void search(int i, int j){
        if (i >= h || j < 0)
            return;
        if (matrix[i][j] == target || falg){
            falg = true;
            return;
        }
        if (matrix[i][j] < target)
            search(i + 1, j);
        if (matrix[i][j] > target)
            search(i, j - 1);
    }
}
