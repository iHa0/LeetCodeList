/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode root, int sum) {
        if (root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null && sum == target) return true;
        boolean left = dfs(root.left, sum);
        boolean right = dfs(root.right, sum);
        return left || right;
    }
}
