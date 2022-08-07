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
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> map = new HashMap<>();
    int len;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.len = preorder.length;
        this.inorder = inorder;
        this.preorder = preorder;
        for (int i = 0; i < len; i++) map.put(inorder[i], i);
        return build(0, len - 1, 0, len - 1);
    }

    private TreeNode build(int pstart, int pend, int istart, int iend) {
        if (pstart > pend || istart > iend) return null;
        int index = map.get(preorder[pstart]);
        int leftLen = index - istart;
        TreeNode root = new TreeNode(inorder[index]);
        root.left = build(pstart + 1, pstart + leftLen, istart, iend + leftLen - 1);
        root.right = build(pstart + leftLen + 1, pend, index + 1, iend);
        return root;
    } 
}
