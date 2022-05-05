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
    int max = 0;
    Map<Integer, Integer> map = new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        return max;
    }

    private void dfs(TreeNode root, int level, int pos) {
        if (root == null) return;
        map.computeIfAbsent(level, k -> pos);
        max = Math.max(max, pos - map.get(level) + 1);
        dfs(root.left, level + 1, 2 * pos);
        dfs(root.right, level + 1, 2 * pos + 1);
    }
}
