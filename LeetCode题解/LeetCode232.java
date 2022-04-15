class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        if (outStack.isEmpty()) in2out();
        return outStack.pop();
    }
    
    public int peek() {
        if (outStack.isEmpty()) in2out();
        return outStack.peek();
    }
    
    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }

    public void in2out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
