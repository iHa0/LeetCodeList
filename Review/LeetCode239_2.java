class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) queue.pollLast();
            queue.addLast(i);
            if(queue.peek() < i - k + 1) queue.poll();
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[queue.peek()];
            }
        }
        return res;
    }
}
