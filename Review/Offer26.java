/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if (a == null || b == null) return false;
        return match(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }

    private boolean match(TreeNode left, TreeNode right) {
        if (right == null) return true;
        if (left == null || left.val != right.val) return false;
        return match(left.left, right.left) && match(left.right, right.right);
    }
}
