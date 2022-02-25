public class LeetCode1448 {
    int res = 0;
    public int goodNodes(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root, Integer.MIN_VALUE);
        return res;
    }

    private void dfs(TreeNode node, int max) {
        if (node == null)
            return;
        if (node.val >= max)
            res++;
        dfs(node.left, Math.max(max, node.val));
        dfs(node.right, Math.max(max, node.val));
    }
}
