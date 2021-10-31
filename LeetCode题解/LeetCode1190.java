import com.sun.jdi.CharType;

import java.util.*;

public class LeetCode1190 {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        Deque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ')'){
                stack.push(s.charAt(i));
            }else {
                while (stack.peek() != '('){
                    char ch = stack.pop();
                    queue.add(ch);
                }
                if (stack.peek() == '('){
                    stack.pop();
                    while (!queue.isEmpty()){
                        stack.push(queue.pop());
                    }
                }
            }
        }
        String res = "";
        while (!stack.isEmpty()){
            res += stack.pop();
        }
        String temp = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            temp += res.charAt(i);
        }
        return temp;
    }
}
