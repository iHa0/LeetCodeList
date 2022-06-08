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
    public void flatten(TreeNode root) {
        if (root == null || root.left == null && root.right == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode node = root.left;
        if (node == null) return;
        while (node != null && node.right != null) node = node.right;
        node.right = root.right;
        root.right = root.left;
        root.left = null;
    }
}
