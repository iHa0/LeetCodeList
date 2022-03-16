import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102_2 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> a = new ArrayList<>();
        a.add(root.val);
        res.add(a);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    temp.add(node.left.val);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right.val);
                    queue.add(node.right);
                }
            }
            if (temp.size() > 0)
                res.add(temp);
        }
        return res;
    }
}
