import jdk.nashorn.api.tree.Tree;

import java.util.ArrayList;

public class LeetCode114 {
    public void flatten(TreeNode root) {
        if (root == null){
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        preTral(root , arrayList);
        TreeNode p = root;
        arrayList.remove(0);
        for (int treeVal : arrayList) {
            p.left = null;
            p.right = new TreeNode(treeVal);
            p = p.right;
        }
    }

    public void preTral(TreeNode root , ArrayList<Integer> arrayList){
        if (root == null){
            return;
        }
        arrayList.add(root.val);
        preTral(root.left , arrayList);
        preTral(root.right , arrayList);
    }
}
