class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] res = new int[len];
        for (int i = 1; i < len; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int saveTemper = stack.pop();
                res[saveTemper] = i - saveTemper;
            }
            stack.push(i);
        }
        return res;
    }
}
