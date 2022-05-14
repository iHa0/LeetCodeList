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
    int maxPos = 0, count = 0;
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        dfs(root, 1);
        return maxPos == count;
    }

    private void dfs(TreeNode root, int pos) {
        if (root == null) return;
        count++;
        maxPos = Math.max(maxPos, pos);
        dfs(root.left, 2 * pos);
        dfs(root.right, 2 * pos + 1);
    }
}
