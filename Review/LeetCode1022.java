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
    int res = 0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int curSum) {
        if (root == null) return;
        curSum = curSum * 2 + root.val;
        if (root.left == null && root.right == null) res += curSum;
        dfs(root.left, curSum);
        dfs(root.right, curSum);
    }
}
