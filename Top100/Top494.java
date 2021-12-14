package Top100;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top494 {
    int target, res;
    public int findTargetSumWays(int[] nums, int target) {
        this.target = target;
        this.res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeNode head = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = nums[i], fcur = -cur;
            hashMap = new HashMap<>();
            for (int j = 0; j < Math.pow(2, i); j++) {
                TreeNode p = queue.poll();
                p.left = new TreeNode(p.val + cur);
                queue.add(p.left);
                hashMap.put(p.val + cur, hashMap.getOrDefault(p.val + cur, 0) + 1);
                p.right = new TreeNode(p.val + fcur);
                queue.add(p.right);
                hashMap.put(p.val + fcur, hashMap.getOrDefault(p.val + fcur, 0) + 1);
            }
        }
        return hashMap.getOrDefault(target, 0);
    }
}
