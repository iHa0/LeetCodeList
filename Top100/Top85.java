import java.util.Stack;

public class Top85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        if (matrix[0].length == 0)
            return 0;
        int res = 0, h = matrix.length, l = matrix[0].length;
        int[] nums = new int[l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] == '1'){
                    nums[j] += 1;
                }else
                    nums[j] = 0;
            }
            res = Math.max(res, stackSore(nums));
        }
        return res;
    }
    public int stackSore(int[] nums){
        int[] newNums = new int[nums.length + 2];
        newNums[0] = 0;
        newNums[newNums.length - 1] = 0;
        for (int i = 0; i < nums.length; i++) {
            newNums[i + 1] = nums[i];
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < newNums.length; i++) {
            while (!stack.isEmpty() && newNums[i] < newNums[stack.peek()]){
                int cur = stack.pop();
                int height = newNums[cur];
                int right = i;
                int left = stack.peek();
                int size = height * (right - left - 1);
                res = Math.max(res, size);
            }
            stack.push(i);
        }
        return res;
    }
}
