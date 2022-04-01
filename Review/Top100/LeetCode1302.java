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
    int deep = 0;
    int res = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int cur) {
        if (root == null) return;
        if (cur > deep) {
            deep = cur;
            res = 0;
        }
        if (cur == deep) res += root.val;
        dfs(root.left, cur + 1);
        dfs(root.right, cur + 1);
    }
}
