import java.util.HashMap;

public class LeetCode105 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int[] preorder;
    int[] inorder;
    int len;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.len = preorder.length;
        this.preorder = preorder;
        this.inorder = inorder;
        for (int i = 0; i < len; i++) {
            hashMap.put(inorder[i], i);
        }
        TreeNode res = build(0, len - 1, 0, len - 1);
        return res;
    }

    private TreeNode build(int pstart, int pend, int istart, int iend) {
        if (pstart > pend || istart > iend)
            return null;
        int index = hashMap.get(preorder[pstart]);
        int leftLen = index - istart;
        TreeNode node = new TreeNode(preorder[pstart]);
        node.left = build(pstart + 1, pstart + leftLen, istart, istart + leftLen - 1);
        node.right = build(pstart + leftLen + 1, pend, index + 1, iend);
        return node;
    }
}
