import java.util.*;

public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        Stack<List<Integer>> stacks = new Stack<>();
        TreeNode p = root;
        queue.add(root);
        List<Integer> listt = new ArrayList<>();
        listt.add(root.val);
        stacks.add(listt);
        int flag = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> listtt = new ArrayList<>();
            for (int i = 0 ; i < size ; i++){
                p = queue.poll();
                if (p.left != null){
                    queue.add(p.left);
                    listtt.add(p.left.val);
                }
                if (p.right != null){
                    queue.add(p.right);
                    listtt.add(p.right.val);
                }
            }
            if (!queue.isEmpty()) {
                stacks.add(listtt);
            }
            flag ++;
        }
        while (!stacks.isEmpty()){
            lists.add(stacks.pop());
        }

        return lists;
    }
}
