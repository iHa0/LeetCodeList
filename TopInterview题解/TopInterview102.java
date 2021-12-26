package TopInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopInterview102 {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        TreeNode flag = root;
        list.add(root.val);
        res.add(list);
        while (!queue.isEmpty()){
            int size = queue.size();
            list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                if (p.left != null){
                    list.add(p.left.val);
                    queue.add(p.left);
                }
                if (p.right != null){
                    list.add(p.right.val);
                    queue.add(p.right);
                }
            }
            if (list.size() > 0)
                res.add(list);
        }
        return res;
    }
}
