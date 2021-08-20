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
   int flag = 1;
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        balanceLevel(root);
        if (flag == -1){
            return false;
        }else {
            return true;
        }
    }

    public int balanceLevel(TreeNode root){
        if (root == null)
            return 0;
        int lLeft = balanceLevel(root.left);
        int lRight = balanceLevel(root.right);
        if (Math.abs(lLeft - lRight) >1){
            flag = -1;
        }
        return Math.max(lLeft , lRight) + 1;
    }
}
