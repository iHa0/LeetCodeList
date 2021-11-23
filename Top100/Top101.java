import java.util.ArrayList;

public class Top101 {
    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        headLeft(root);
        headright(root);
        return left.equals(right);
    }

    public void headLeft(TreeNode treeNode){
        if (treeNode == null){
            left.add(0);
            return;
        }
        left.add(treeNode.val);
        headLeft(treeNode.left);
        headLeft(treeNode.right);
    }
    public void headright(TreeNode treeNode){
        if (treeNode == null){
            right.add(0);
            return;
        }
        right.add(treeNode.val);
        headright(treeNode.right);
        headright(treeNode.left);
    }
}
