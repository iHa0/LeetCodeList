public class CodingInterviews55_1 {
    public int maxDepth(TreeNode root) {
        return lastOrder(root);
    }
    public int lastOrder(TreeNode root){
        if (root == null)
            return 0;
        int left = lastOrder(root.left);
        int right = lastOrder(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
