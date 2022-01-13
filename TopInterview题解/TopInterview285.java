package TopInterview;

import java.util.ArrayList;

public class TopInterview285 {
    ArrayList<TreeNode> arrayList = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        onOrder(root);
        int len = arrayList.size();
        for (int i = 0; i < len; i++) {
            if (arrayList.get(i) == p){
                if (i + 1 < len)
                    return arrayList.get(i + 1);
            }
        }
        return null;
    }

    public void onOrder(TreeNode node){
        if (node == null)
            return;
        onOrder(node.left);
        arrayList.add(node);
        onOrder(node.right);
    }
}
