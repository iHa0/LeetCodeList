import java.util.Stack;

public class Top84_2 {
    public int largestRectangleArea(int[] heights) {
        int[] newheights = new int[heights.length + 2];
        newheights[0] = 0;
        newheights[newheights.length - 1] = 0;
        for (int i = 0; i < heights.length; i++) {
            newheights[i + 1] = heights[i];
        }
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < newheights.length; i++) {
            while (!stack.isEmpty() && newheights[i] < newheights[stack.peek()]){
                int cur = stack.pop();
                int curheight = newheights[cur];
                int left = stack.peek();
                int right = i;
                int size = curheight * (right - left - 1);
                res = Math.max(res, size);
            }
            stack.push(i);
        }
        return res;
    }
}
