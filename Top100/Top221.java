package Top100;

import java.util.Stack;

public class Top221 {
    public int maximalSquare(char[][] matrix) {
        int h = matrix.length, l = matrix[0].length;
        int[] nums = new int[l];
        int max = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                if (matrix[i][j] == '1'){
                    nums[j] += 1;
                }else {
                    nums[j] = 0;
                }
            }
            max = Math.max(max, maxNum(nums));
        }
        return max;
    }

    public int maxNum(int[] nums){
        int len = nums.length;
        int[] newHeight = new int[len + 2];
        newHeight[0] = 0;
        newHeight[newHeight.length - 1] = 0;
        for (int i = 0; i < len; i++) {
            newHeight[i + 1] = nums[i];
        }
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < newHeight.length; i++) {
            while (!stack.isEmpty() && newHeight[i] < newHeight[stack.peek()]){
                int cur = stack.pop();
                int height = newHeight[cur];
                int left = stack.peek();
                int right = i;
                if (height <= (right - left - 1)){
                    int size = height * height;
                    max = Math.max(max, size);
                }
            }
            stack.push(i);
        }
        return max;
    }
}
