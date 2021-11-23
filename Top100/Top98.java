import java.util.ArrayList;

public class Top98 {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        mid(root);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= arrayList.get(i - 1))
                return false;
        }
        return true;
    }
    public void mid(TreeNode treeNode){
        if (treeNode == null)
            return;
        mid(treeNode.left);
        arrayList.add(treeNode.val);
        mid(treeNode.right);
    }
}
