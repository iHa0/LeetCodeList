import java.util.Stack;

public class LeetCode316 {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        char a;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            a = s.charAt(i);
            if (stack.contains(a)){
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > a && s.indexOf(stack.peek() , i) != -1){
                stack.pop();
            }
            stack.push(a);
        }
        char[] res = new char[stack.size()];
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }

        return new String(res);
    }
}
