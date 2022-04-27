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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (res.size() - 1 < level) res.add(new ArrayList<>());
        res.get(level).add(root.val);
        if (root.left != null) dfs(root.left, level + 1);
        if (root.right != null) dfs(root.right, level + 1);
    }
}
