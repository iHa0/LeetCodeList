import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CodingInterviews32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null)
            return resList;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode p = root;
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> qList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                p = queue.poll();
                qList.add(p.val);
                if (p.left != null){
                    queue.add(p.left);
                }
                if (p.right != null){
                    queue.add(p.right);
                }
            }
            resList.add(qList);
        }
        return resList;
    }
}
