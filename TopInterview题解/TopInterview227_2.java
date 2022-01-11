package TopInterview;

import java.util.Stack;

public class TopInterview227 {
    public int calculate(String s) {
        s = s.trim();
        Stack<Integer> stack = new Stack<>();
        int len = s.length();
        int index = 0;
        while (index < len){
            char ch = s.charAt(index);
            if (ch == ' '){
                index++;
                continue;
            }
            if (ch - '0' >= 0 && ch - '0' <= 9){
                int tempsum = ch - '0';
                index++;
                while (index < len && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9){
                    tempsum *= 10;
                    tempsum += s.charAt(index) - '0';
                    index++;
                }
                stack.add(tempsum);
                continue;
            }else {
                if (ch == '*' || ch == '/'){
                    while (!(s.charAt(index) <= '9' && s.charAt(index) >= '0')){
                        index++;
                    }
                    int stackInt = stack.pop();
                    if (ch == '*'){
                        int tempsum = s.charAt(index) - '0';
                        index++;
                        while (index < len && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9){
                            tempsum *= 10;
                            tempsum += s.charAt(index) - '0';
                            index++;
                        }
                        stack.add(tempsum * stackInt);
                        continue;
                    }
                    if (ch == '/'){
                        int tempsum = s.charAt(index) - '0';
                        index++;
                        while (index < len && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9){
                            tempsum *= 10;
                            tempsum += s.charAt(index) - '0';
                            index++;
                        }
                        stack.add(stackInt / tempsum);
                        continue;
                    }
                }else {
                    while (!(s.charAt(index) <= '9' && s.charAt(index) >= '0')){
                        index++;
                    }
                    if (ch == '+') {
                        int tempsum = s.charAt(index) - '0';
                        index++;
                        while (index < len && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9){
                            tempsum *= 10;
                            tempsum += s.charAt(index) - '0';
                            index++;
                        }
                        stack.add(tempsum);
                        continue;
                    }else {
                        int tempsum = s.charAt(index) - '0';
                        index++;
                        while (index < len && s.charAt(index) - '0' >= 0 && s.charAt(index) - '0' <= 9){
                            tempsum *= 10;
                            tempsum += s.charAt(index) - '0';
                            index++;
                        }
                        stack.add(-tempsum);
                        continue;
                    }
                }
            }
            index++;
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
