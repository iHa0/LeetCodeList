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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return sum;
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int n) {
        if (root == null) return;
        n = n * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += n;
            return;
        }
        dfs(root.left, n);
        dfs(root.right, n);
    }
}
