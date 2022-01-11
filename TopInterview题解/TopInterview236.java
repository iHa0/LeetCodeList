package TopInterview;

public class TopInterview236 {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lastOrder(root, p, q);
        return res;
    }

    public int lastOrder(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || res != null)
            return 0;
        int left = lastOrder(root.left, p, q);
        int right = lastOrder(root.right, p, q);
        if ((left == 1 || right == 1) && (root.val == p.val || root.val == q.val)){
            res = root;
        }
        if (left == 1 && right == 1){
            res = root;
        }

        if (root.val == p.val || root.val == q.val)
            return 1;
        return left + right;
    }
}
