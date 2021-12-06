package Top100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Top301_2 {
    List<String> res = new ArrayList<>();
    public List<String> removeInvalidParentheses(String s) {
        // 计算出要移除的左右括号数
        int lr =0;
        int rr = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                lr++;
            if(s.charAt(i) == ')'){
                if(lr > 0)
                    lr --;
                else {
                    rr++;
                }
            }
        }
        backTrack(0, lr, rr, s);
        return res;
    }
    // 回溯，移除括号
    void backTrack(int start, int lr, int rr, String s){
        // 完成条件
        if(lr == 0 && rr == 0){
            if(isValid(s))
                res.add(s);
        }
        for (int i = start; i < s.length(); i++) { // )(())(
            if(i > start && s.charAt(i) == s.charAt(i - 1))
                continue;
            if(s.charAt(i) == '('  && lr > 0){
                backTrack(i, lr - 1, rr, s.substring(0, i) + s.substring(i + 1));
            }
            if(s.charAt(i) == ')'  && rr > 0){
                backTrack(i, lr, rr - 1, s.substring(0, i) + s.substring(i + 1));
            }
        }
    }
    // 判定是否有效
    boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '('){
                stack.pop();
                continue;
            }
            if(s.charAt(i) != '(' && s.charAt(i) != ')')
                continue;
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
