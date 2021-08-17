public class LeetCode110 {
    int flag = 1;
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        balanceLevel(root);
        if (flag == -1){
            return false;
        }else {
            return true;
        }
    }

    public int balanceLevel(TreeNode root){
        if (root == null)
            return 0;
        int lLeft = balanceLevel(root.left);
        int lRight = balanceLevel(root.right);
        if (Math.abs(lLeft - lRight) >1){
            flag = -1;
        }
        return Math.max(lLeft , lRight) + 1;
    }

}
