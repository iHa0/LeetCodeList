package TopInterview;

import java.util.LinkedList;
import java.util.List;

public class TopInterview94 {
    List<Integer> list = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return list;
    }
    public void inorder(TreeNode node){
        if (node == null)
            return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
}
