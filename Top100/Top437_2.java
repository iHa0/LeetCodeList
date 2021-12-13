package Top100;

import java.util.HashMap;

public class Top437_2 {
    HashMap<Integer, Integer> hashMap;
    int target;
    public int pathSum(TreeNode root, int targetSum) {
        this.hashMap = new HashMap<>();
        this.target = targetSum;
        hashMap.put(0, 1);
        int res = run(root, 0);
        return res;
    }

    public int run(TreeNode node, int curSum){
        if (node == null)
            return 0;
        curSum += node.val;
        int res = hashMap.getOrDefault(curSum - target, 0);
        hashMap.put(curSum, hashMap.getOrDefault(curSum, 0) + 1);
        int left = run(node.left, curSum);
        int right = run(node.right, curSum);
        hashMap.put(curSum, hashMap.get(curSum) - 1);
        return res + left + right;
    }
}
