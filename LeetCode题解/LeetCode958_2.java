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
    int count = 0, maxPos = 0;
    public boolean isCompleteTree(TreeNode root) {
        dfs(root, 1);
        return count == maxPos;
    }

    private void dfs(TreeNode root, int pos) {
        if (root == null) return;
        count++;
        maxPos = Math.max(maxPos, pos);
        dfs(root.left, 2 * pos);
        dfs(root.right, 2 * pos + 1);
    }
}
