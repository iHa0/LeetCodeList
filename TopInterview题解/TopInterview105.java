package TopInterview;

import java.util.HashMap;

public class TopInterview105 {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        for (int i = 0; i < len; i++) {
            hashMap.put(inorder[i], i);
        }
        TreeNode res = build(preorder, inorder, 0, len - 1, 0, len - 1);
        return res;
    }
    public TreeNode build(int[] preorder, int[] inorder, int pstar, int pend, int istar, int iend){
        if (pend < pstar)
            return null;
        int index = hashMap.get(preorder[pstar]);
        int left = index - istar;
        TreeNode node = new TreeNode(preorder[pstar]);
        node.left = build(preorder, inorder, pstar + 1, pstar + left, istar, istar + left - 1);
        node.right = build(preorder, inorder, pstar + left + 1, pend, index + 1, iend);
        return node;
    }
}
