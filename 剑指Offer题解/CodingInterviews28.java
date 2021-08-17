import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CodingInterviews28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        queue.add(root);
        list1.add(root.val);
        TreeNode p = root;
        while (!queue.isEmpty()){
            p = queue.poll();
            if (p.left != null){
                queue.add(p.left);
                list1.add(p.left.val);
            }else {
                list1.add(-1);
            }
            if (p.right != null){
                queue.add(p.right);
                list1.add(p.right.val);
            }else {
                list1.add(-1);
            }
        }
        queue.add(root);
        list2.add(root.val);
        while (!queue.isEmpty()){
            p = queue.poll();
            if (p.right != null){
                queue.add(p.right);
                list2.add(p.right.val);
            }else {
                list2.add(-1);
            }
            if (p.left != null){
                queue.add(p.left);
                list2.add(p.left.val);
            }else {
                list2.add(-1);
            }
        }
        return list1.equals(list2);
    }
}
