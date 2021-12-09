package Top100;

import java.util.Stack;

public class Top394 {
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();
    public String decodeString(String s) {
        String temp = "";
        int len = s.length();
        if (len == 0)
            return temp;
        for (int i = 0; i < len; i++) {
            if (!stack1.isEmpty() && s.charAt(i) == ']'){
                String stackTemp = stack1.pop();
                if (stack1.peek().equals("["))
                    stack1.pop();
                String ptt = "";
                while (!stack1.isEmpty() && (stack1.peek().charAt(0) >= '0' && stack1.peek().charAt(0) <= '9'))
                    stack2.push(stack1.pop());
                while (!stack2.isEmpty())
                    ptt += stack2.pop();
                int count = Integer.valueOf(ptt);
                String pushString = "";
                for (int j = 0; j < count; j++) {
                    pushString += stackTemp;
                }
                stack1.push(pushString);
            }
            if (s.charAt(i) == ']'){
                String ptt = "";
                if (stack1.size() == 1)
                    continue;
                while (!stack1.isEmpty() && (stack1.peek().charAt(0) >= 'a' && stack1.peek().charAt(0) <= 'z' || stack1.peek().charAt(0) >= 'A' && stack1.peek().charAt(0) <= 'Z'))
                    stack2.push(stack1.pop());
                while (!stack2.isEmpty())
                    ptt += stack2.pop();
                if (!ptt.equals(""))
                    stack1.push(ptt);
                continue;
            }
            String pt = s.charAt(i) + "";
            if (s.charAt(i) == '[' || s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9){
                stack1.push(pt);
                continue;
            }
            else {
                stack1.push(pt);
                pt = "";
                while (!stack1.isEmpty() && (stack1.peek().charAt(0) >= 'a' && stack1.peek().charAt(0) <= 'z' || stack1.peek().charAt(0) >= 'A' && stack1.peek().charAt(0) <= 'Z'))
                    stack2.push(stack1.pop());
                while (!stack2.isEmpty())
                    pt += stack2.pop();
                stack1.push(pt);
            }
        }
        return stack1.pop();
    }
}
