import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Top102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        temp.add(root.val);
        res.add(temp);
        while (!queue.isEmpty()){
            int size = queue.size();
            temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (cur.left != null){
                    temp.add(cur.left.val);
                    queue.add(cur.left);
                }
                if (cur.right != null){
                    temp.add(cur.right.val);
                    queue.add(cur.right);
                }
            }
            if (temp.size() > 0){
                res.add(temp);
            }
        }
        return res;
    }
}
