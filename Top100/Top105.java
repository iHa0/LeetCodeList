import java.util.ArrayList;
import java.util.Arrays;

public class Top105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode treeNode = null;
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]){
                treeNode = new TreeNode(inorder[i]);
                // 有左子树
                if (i != 0){
                    int[] newPreorder = Arrays.copyOfRange(preorder, 1, i + 1);
                    int[] newInorder = Arrays.copyOfRange(inorder, 0, i);
                    treeNode.left = buildTree(newPreorder, newInorder);
                }
                // 有右子树
                if (i != inorder.length - 1){
                    int len = inorder.length;
                    int[] newPreorder = Arrays.copyOfRange(preorder, i + 1, len);
                    int[] newInorder = Arrays.copyOfRange(inorder, i + 1, len);
                    treeNode.right = buildTree(newPreorder, newInorder);
                }
            }
        }
        return treeNode;
    }
}
