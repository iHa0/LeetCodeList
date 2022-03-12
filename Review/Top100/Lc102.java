import java.util.*;

public class LeetCode102 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        res.add(new ArrayList<>(list));
        while (!queue.isEmpty()){
            list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode p = queue.poll();
                if (p.left != null){
                    queue.add(p.left);
                    list.add(p.left.val);
                }
                if (p.right != null){
                    queue.add(p.right);
                    list.add(p.right.val);
                }
            }
            if (list.size() > 0)
                res.add(new ArrayList<>(list));
        }
        return res;
    }
}
