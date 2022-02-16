package Top100Review;

import java.util.Stack;

public class Lc20 {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{'){
                stack.add(ch);
            } else {
                if (!stack.isEmpty()){
                    char p = stack.peek();
                    if (p == '(' && ch == ')'){
                        stack.pop();
                        continue;
                    }
                    if (p == '[' && ch == ']'){
                        stack.pop();
                        continue;
                    }
                    if (p == '{' && ch == '}'){
                        stack.pop();
                        continue;
                    }
                }
                stack.add(ch);
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
