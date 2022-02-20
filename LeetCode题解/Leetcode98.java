import java.util.ArrayList;
import java.util.List;

public class LeetCode98 {
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        preOrder(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
    }

    private void preOrder(TreeNode node) {
        if (node == null)
            return;
        preOrder(node.left);
        list.add(node.val);
        preOrder(node.right);
    }
}
