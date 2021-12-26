package TopInterview;

import java.util.ArrayList;
import java.util.List;

public class TopInterview98 {
    List<Integer> list;
    public boolean isValidBST(TreeNode root) {
        this.list = new ArrayList<>();
        inorder(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i))
                return false;
        }
        return true;
    }
    public void inorder(TreeNode node){
        if (node == null){
            return;
        }
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }
}
