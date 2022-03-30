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
    int deepMax = 0;
    int res = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int deepCur) {
        if (root == null) return;
        if (deepCur > deepMax) {
            deepMax = deepCur;
            res = 0;
        }
        if (deepCur == deepMax) {
            res += root.val;
        }
        dfs(root.left, deepCur + 1);
        dfs(root.right, deepCur + 1);
    }
}
