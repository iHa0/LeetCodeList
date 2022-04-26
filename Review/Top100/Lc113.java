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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        LinkedList<Integer> list = new LinkedList<>();
        dfs(root, list, 0);
        return res;
    }

    private void dfs(TreeNode root, LinkedList<Integer> list, int sum) {
        if (root == null) return;
        sum += root.val;
        list.add(root.val);
        if (root.left == null && root.right == null) {
            if (sum == target) {
                res.add(new ArrayList<>(list));
            }
        }
        dfs(root.left, list, sum);
        dfs(root.right, list, sum);
        list.removeLast();
    }
}
