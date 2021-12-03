package Top100;

import java.util.LinkedList;

public class Top239_2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty() && nums[linkedList.peekLast()] < nums[i]){
                linkedList.pollLast();
            }
            linkedList.addLast(i);
            if (i - linkedList.peekFirst() >= k){
                linkedList.pollFirst();
            }
            if (i >= k - 1){
                res[index++] = nums[linkedList.peekFirst()];
            }
        }
        return res;
    }
}
