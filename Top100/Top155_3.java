package Top100;

import java.util.Stack;

public class Top155_3 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public Top155_3() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int val) {
        stack1.push(val);
        if (!stack2.isEmpty()){
            int min = stack2.peek();
            if (min > val){

                stack2.push(val);
            }else
                stack2.push(min);
        }else {
            stack2.push(val);
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }
}
