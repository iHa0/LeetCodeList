public class Top124 {
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        inorder(root);
        return max;
    }
    public int inorder(TreeNode root){
        if (root == null)
            return 0;
        int left = Math.max(inorder(root.left), 0);
        int right = Math.max(inorder(root.right), 0);
        int temp = Math.max(left, right);
        int plusRoot = left + right + root.val;
        if (temp < plusRoot){
            max = plusRoot;
        }
        return temp + root.val;
    }
}
