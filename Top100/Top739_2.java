package Top100;

import java.util.Stack;

public class Top739_2 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int len = temperatures.length;
        int[] res = new int[len];
        stack.push(0);
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int saveTemp = stack.pop();
                int num = i - saveTemp;
                res[saveTemp] = num;
            }
            stack.push(i);
        }
        return res;
    }
}
