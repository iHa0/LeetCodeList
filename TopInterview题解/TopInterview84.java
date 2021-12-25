package TopInterview;

import java.util.Stack;

public class TopInterview84 {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] newHeight = new int[len + 2];
        int newlen = newHeight.length;
        newHeight[0] = 0;
        newHeight[newlen - 1] = 0;
        for (int i = 0; i < len; i++) {
            newHeight[i + 1] = heights[i];
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(newHeight[0]);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < newlen; i++) {
            while (!stack.isEmpty() && newHeight[i] < newHeight[stack.peek()]){
                int cur = stack.pop();
                int left = stack.peek();
                int right = i;
                int height = newHeight[cur];
                max = Math.max(max, height * (right - left - 1));
            }
            stack.push(i);
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
