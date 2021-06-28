import java.util.ArrayList;
public class CodingInterviews54 {
    ArrayList<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        if (root == null)
            return -1;
        inOrder(root);
        return list.get(list.size() - k);
    }
    public void inOrder(TreeNode root){
        if (root == null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
