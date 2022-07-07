class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int a : pushed) {
            stack.push(a);
            while (!stack.isEmpty() && popped[index] == stack.peek()) {
                stack.pop();
                index++;
            } 
        }
        return stack.isEmpty();
    }
}
