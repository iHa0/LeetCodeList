package TopInterview;

import java.util.Stack;

public class TopInterview150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            String a = tokens[i];
            if (!(a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/"))){
                stack.add(Integer.valueOf(a));
            }else {
                int x = Integer.valueOf(stack.pop());
                int y = Integer.valueOf(stack.pop());
                if (a.equals("+")){
                    stack.add(x + y);
                }else if (a.equals("-")){
                    stack.add(y - x);
                }else if (a.equals("*")){
                    stack.add(x * y);
                }else if (a.equals("/")){
                    stack.add(y / x);
                }
            }
        }
        if (!stack.isEmpty())
            return stack.pop();
        return -1;
    }
}
