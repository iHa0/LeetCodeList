public class LeetCode1448 {
    int res = 0;
    public int goodNodes(TreeNode root) {
        preOrder(root, Integer.MIN_VALUE);
        return res;
    }

    private void preOrder(TreeNode node, int max) {
        if (node == null)
            return;
        if (max <= node.val)
            res++;
        max = Math.max(max, node.val);
        preOrder(node.left, max);
        preOrder(node.right, max);
    }
}
