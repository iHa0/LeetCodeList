package TopInterview;

import java.util.ArrayList;

public class TopInterview230 {
    ArrayList<Integer> res = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return -1;
        onOrder(root);
        int len = res.size();
        return res.get(k - 1);
    }

    public void onOrder(TreeNode node){
        if (node == null)
            return;
        onOrder(node.left);
        res.add(node.val);
        onOrder(node.right);
    }
}
