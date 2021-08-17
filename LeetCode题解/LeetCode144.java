import java.util.ArrayList;
import java.util.List;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        preOrder(root , resList);
        return resList;
    }
    public void preOrder(TreeNode root , List<Integer> list){
        if (root == null)
            return;
        list.add(root.val);
        preOrder(root.left , list);
        preOrder(root.right , list);
    }
}
