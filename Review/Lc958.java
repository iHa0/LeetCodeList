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
    int maxCount, nodeCount;
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        dfs(root, 1);
        return maxCount == nodeCount;
    }

    private void dfs(TreeNode root, int pos) {
        if (root == null) return;
        maxCount = Math.max(maxCount, pos);
        nodeCount++;
        dfs(root.left, 2 * pos);
        dfs(root.right, 2 * pos + 1);
    }
}
