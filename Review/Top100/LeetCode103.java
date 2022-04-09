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
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return res;
        dfs(root, 0);
        return res;
    }

    private void dfs(TreeNode node, int level) {
        if (res.size() - 1 < level) res.add(new ArrayList<>());
        if (level % 2 == 1) {
            res.get(level).add(0, node.val);
        } else {
            res.get(level).add(node.val);
        }
        if (node.left != null) dfs(node.left, level + 1);
        if (node.right != null) dfs(node.right, level + 1);
    }
}
