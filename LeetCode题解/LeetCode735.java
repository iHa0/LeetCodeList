class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int len = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        int flag = 0;
        for (int i = 1; i < len; i++) {
            int a = asteroids[i];
            flag = 0;
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() * a < 0 && Math.abs(a) >= stack.peek()) {
                if (Math.abs(a) == Math.abs(stack.peek())) {
                    stack.pop();
                    flag = 1;
                    break;
                }
                stack.pop();
            } 
            if (!stack.isEmpty() && stack.peek() > 0 && stack.peek() * a < 0 && Math.abs(a) < Math.abs(stack.peek())) continue;
            if (flag == 0)
                stack.push(a);
        }
        int size = stack.size();
        int[] res= new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
