import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class CodingInterviews32 {
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null){
            return new int[0];
        }
        int count = 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode p = root;
        queue.add(root);
        while (!queue.isEmpty()){
            p = queue.poll();
            res.add(p.val);
            if (p.left != null){
                queue.add(p.left);
            }
            if (p.right != null){
                queue.add(p.right);
            }
        }
        int i = 0;
        int[] ress = new int[res.size()];
        for (int a :
                res) {
            ress[i ++] = a;
        }
        return ress;

    }
}
