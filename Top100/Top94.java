import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Top94 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return res;
        mid(root);
        return res;
    }
    public void mid(TreeNode treeNode){
        if (treeNode == null)
            return;
        mid(treeNode.left);
        res.add(treeNode.val);
        mid(treeNode.right);
    }
}
