import java.util.Arrays;
import java.util.Stack;

public class Top32 {
    public int longestValidParentheses(String s) {
        if (s.length() == 0)
            return 0;
        Stack<Character> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        int count = 0, max = 0;
        int[] temp = new int[s.length()];
        Arrays.fill(temp, 1);
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == ')'){
                if (stack.isEmpty()){
                    stack.add(a);
                    stack1.add(i);
                    continue;
                }
                if (stack.peek() == '('){
                    stack.pop();
                    stack1.pop();
                }else {
                    stack.add(a);
                    stack1.add(i);
                }
            }
            if (a == '('){
                stack.add(a);
                stack1.add(i);
            }
        }
        while (!stack1.isEmpty()){
            temp[stack1.pop().intValue()] = 0;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0){
                if (count > max){
                    max = count;
                    count = 0;
                }
                count = 0;
            }
            if (temp[i] == 1)
                count++;
        }
        return Math.max(max, count);
    }
}
