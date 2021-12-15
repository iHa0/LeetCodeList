package Top100;

import java.util.HashMap;

public class Top543 {
    HashMap<TreeNode, Integer> hashMap;
    int max = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        this.hashMap = new HashMap<>();
        dfs(root);
        return max;
    }
    public int dfs(TreeNode node){
        if (node == null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        if (left == 0 && right == 0) {
            node.val = 0;
            hashMap.put(node, 0);
            int temp = Math.max(node.val, hashMap.get(node));
            max = Math.max(temp, max);
            return 1;
        }
        if (left == 0 && right != 0 || left != 0 && right == 0){
            node.val = node.left == null ? node.right.val + 1 : node.left.val + 1;
            hashMap.put(node, node.val);
            int temp = Math.max(node.val, hashMap.get(node));
            max = Math.max(temp, max);
            return 1;
        }
        node.val = Math.max(node.left.val, node.right.val) + 1;
        hashMap.put(node, node.left.val + node.right.val + 2);
        int temp = Math.max(node.val, hashMap.get(node));
        max = Math.max(temp, max);
        return 1;
    }
}
