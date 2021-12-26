package TopInterview;

public class TopInterview101 {
    boolean flag = true;
    public boolean isSymmetric(TreeNode root) {
        inorder(root.left, root.right);
        return flag;
    }
    public void inorder(TreeNode left, TreeNode right){
        if (left == null && right == null || flag == false)
            return;
        if (left == null && right != null || left != null && right == null || left.val != right.val){
            flag = false;
            return;
        }
        inorder(left.left, right.right);
        inorder(left.right, right.left);
    }
}
