import javax.print.DocFlavor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null){
            return resList;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> curList = new ArrayList<>();
            int size = queue.size();
            for (int i = 0 ; i < size ; i++){
                TreeNode curNode = queue.poll();
                curList.add(curNode.val);
                if (curNode.left != null){
                    queue.add(curNode.left);
                }
                if (curNode.right != null){
                    queue.add(curNode.right);
                }
            }
            resList.add(curList);
        }
        return resList;
    }
}
