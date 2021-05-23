import java.util.ArrayList;
import java.util.List;

public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root , list);
        return list;
    }
    public void inorder(TreeNode root , List<Integer> list){
        if (root == null){
            return;
        }
        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right , list);
    }
}
