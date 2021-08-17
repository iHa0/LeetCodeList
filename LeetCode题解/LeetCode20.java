import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0){
            return false;
        }
        Map<Character , Character> map = new HashMap<>();
        map.put('}' , '{');
        map.put(')' , '(');
        map.put(']' , '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < len ; i++){
            char temp = s.charAt(i);
            if (map.containsKey(temp)){
                if (stack.isEmpty() || stack.peek() != map.get(temp)){
                    return false;
                }
                if (stack.peek() == map.get(temp)){
                    stack.pop();
                }
            }else {
                stack.add(temp);
            }
        }
        return stack.isEmpty();
    }
}
