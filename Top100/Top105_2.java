import java.util.HashMap;

public class Top105_2 {
    HashMap<Integer, Integer> hashMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            hashMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, len - 1, 0, len - 1);
    }
    public TreeNode buildTree(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd){
        if (pStart > pEnd)
            return null;
        int index = hashMap.get(preorder[pStart]);
        int left = index - iStart;
        TreeNode root = new TreeNode(preorder[pStart]);
        root.left = buildTree(preorder, inorder, pStart + 1, pStart + left, iStart, iStart + left - 1);
        root.right = buildTree(preorder, inorder, pStart + left + 1, pEnd, index + 1, iEnd);
        return root;
    }
}
