public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        postTrav(root);
        return root;
    }

    public void postTrav(TreeNode root){
        if (root == null)
            return;
        if (root.left == null && root.right == null){
            return;
        }
        postTrav(root.left);
        postTrav(root.right);
        TreeNode p = root.right;
        root.right = root.left;
        root.left = p;
    }
}
