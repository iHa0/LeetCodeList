import java.util.ArrayList;
import java.util.List;

public class LeetCode257 {
    List<String> list = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return list;
        String rode = new String();
        preOrder(root , rode);
        return list;
    }

    public void preOrder(TreeNode root , String rode){
        if (root == null)
            return;

        if (root.left == null && root.right == null){
            //todo
            rode += root.val;
            list.add(rode);
        }
        rode += root.val + "->";
        preOrder(root.left , rode);
        preOrder(root.right , rode);
    }
}
