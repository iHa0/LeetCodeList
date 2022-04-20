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
    int[] preorder;
    int[] inorder;
    int len;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        this.len = preorder.length;
        for (int i = 0; i < len; i++) {
            map.put(inorder[i], i);
        }
        TreeNode res = build(0, len - 1, 0, len - 1);
        return res;
    }

    private TreeNode build(int pstart, int pend, int istart, int iend) {
        if (pstart > pend || istart > iend) return null;
        int index = map.get(preorder[pstart]);
        int leftLen = index - istart;
        TreeNode node = new TreeNode(inorder[index]);
        node.left = build(pstart + 1, pstart + leftLen, istart, istart + leftLen - 1);
        node.right = build(pstart + leftLen + 1, pend, index + 1, iend);
        return node;
    }
}
