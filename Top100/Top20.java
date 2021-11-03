class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 == 1)
            return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if (c == ')'){
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }
            if (c == ']'){
                if (!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }if (c == '}'){
                if (!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                    continue;
                }
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
