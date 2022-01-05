package TopInterview;

import java.util.Stack;

public class TopInterview155 {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public TopInterview155() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int val) {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            stack1.push(val);
            stack2.push(val);
        }else {
            stack1.push(val);
            stack2.push(Math.min(val, stack2.peek()));
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
