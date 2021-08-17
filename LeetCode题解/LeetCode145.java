import java.util.ArrayList;
import java.util.List;

public class LeetCode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root , list);
        return list;
    }
    public void postOrder(TreeNode root , List<Integer> list){
        if (root == null)
            return;
        postOrder(root.left , list);
        postOrder(root.right , list);
        list.add(root.val);
    }
}
