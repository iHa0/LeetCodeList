public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        TreeNode r = root;
        return onOrder(root , r);
    }

    public boolean onOrder(TreeNode root , TreeNode r){
        if (root == null && r == null)
            return true;
        if (root == null || r == null)
        return false;
        return root.val == r.val && onOrder(root.left , r.right) && onOrder(root.right , r.left);
    }
}
