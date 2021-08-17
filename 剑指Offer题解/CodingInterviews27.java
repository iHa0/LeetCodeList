public class CodingInterviews27 {
    public TreeNode mirrorTree(TreeNode root) {
        lastOrder(root);
        return root;
    }
    public void lastOrder(TreeNode root){
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        lastOrder(root.left);
        lastOrder(root.right);
        TreeNode p = root.left;
        root.left = root.right;
        root.right = p;
    }
}
