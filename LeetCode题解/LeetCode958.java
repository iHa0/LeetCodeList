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
    Map<Integer, Integer> map = new HashMap<>();
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) return true;
        return dfs(root, 1, 1);   
    }

    private boolean dfs(TreeNode root, int pos, int level) {
        if (root == null) {
            if (map.containsKey(level) && (pos < map.get(level)))return false;
            else return true;
        }
        map.put(level, Math.max(map.getOrDefault(level, 1), pos));
        if (level > 1 && map.containsKey(level) && map.get(level - 1) != Math.pow(2, level - 1) - 1) return false;
        boolean right = dfs(root.right, 2 * pos + 1, level + 1);
        boolean left = dfs(root.left, 2 * pos, level + 1);
        return left && right;
    }
}
