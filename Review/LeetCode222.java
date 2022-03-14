public class LeetCode222 {
    int res = 0;
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        res++;
        dfs(root.left);
        dfs(root.right);
    }
}
