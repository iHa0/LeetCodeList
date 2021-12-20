package TopInterview;

import java.util.Stack;

public class TopInterview20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        char temp;
        for (int i = 0; i < len; i++) {
            char a = s.charAt(i);
            if (stack.isEmpty()){
                stack.push(a);
                continue;
            }else {
                temp = stack.peek();
            }
            if (temp == '(' && a == ')')
                stack.pop();
            else if (temp == '{' && a == '}')
                stack.pop();
            else if (temp == '[' && a == ']')
                stack.pop();
            else
                stack.push(a);
        }
        return stack.isEmpty();
    }
}
