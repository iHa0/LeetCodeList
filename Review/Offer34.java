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
    int target;
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) return res;
        this.target = target;
        LinkedList<Integer> list = new LinkedList<>();
        dfs(root, 0, list);
        return res;
    }

    private void dfs(TreeNode node, int sum, LinkedList<Integer> list) {
        if (node == null) return;
        sum += node.val;
        list.add(node.val);
        if (sum == target) {
            if (node.left == null && node.right == null) {
                res.add(new ArrayList(list));
            }
        }
        dfs(node.left, sum, list);
        dfs(node.right, sum, list);
        list.removeLast();
    }
}
