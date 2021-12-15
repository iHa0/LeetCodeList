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
class LeetCode1038 {
    int cur;
    public TreeNode bstToGst(TreeNode root) {
         this.cur = 0;
        dfs(root);
        return root;
    }
    public void dfs(TreeNode node){
        if (node == null)
            return;
        dfs(node.right);
        node.val = node.val + cur;
        cur = node.val;
        dfs(node.left);
    }
}
