package Review;

import java.util.PriorityQueue;

public class LeetCode912_2 {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for (int a : nums) {
            priorityQueue.add(a);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = priorityQueue.poll();
        }
        return nums;
    }
}
