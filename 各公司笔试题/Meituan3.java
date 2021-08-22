import java.util.Scanner;
import java.util.Stack;

public class Meituan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Stack<Character> stack = new Stack<>();
        int sum = 1, l = 0, l_max= 0, temp = 1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '('){
                stack.push(c);
                l++;
            }
            if (i < input.length() && input.charAt(i + 1) == ')' && stack.peek() == '('){
                temp *= 2;
                i++;
                l++;
                stack.pop();
            }else if (input.charAt(i) == ')'){
                temp += 1;
                stack.pop();
            }
            if (stack.isEmpty()){
                sum *= temp;
                temp = 1;
            }
        }
        System.out.println(sum);
    }
}
