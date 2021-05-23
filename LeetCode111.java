public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lLen = minDepth(root.left) , rLen = minDepth(root.right);
        return (lLen == 0 || rLen == 0) ? lLen + rLen + 1 : Math.min(lLen , rLen) + 1;
    }
}
