public class LeetCode112 {
    public boolean hasPathSum(TreeNode root , int targetSum){
        if (root == null){
            return false;
        }
        int sum = targetSum - root.val;
        if (sum == 0 && root.right == null && root.left == null){
            return true;
        }

        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
