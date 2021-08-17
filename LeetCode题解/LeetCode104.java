public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lLen = maxDepth(root.left) , rLen = maxDepth(root.right);
        return Math.max(lLen , rLen) + 1;
    }
}
