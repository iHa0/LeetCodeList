import java.util.*;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode p = root;
        int count = 1;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();

            List<Integer> list = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < size; i++) {
                p = queue.poll();
                if (count % 2 == 0){
                    stack.add(p.val);
                }else {
                    list.add(p.val);
                }
                if (p.left != null){
                    queue.add(p.left);
                }
                if (p.right != null){
                    queue.add(p.right);
                }
            }
            while (!stack.isEmpty()){
                list.add(stack.pop());
            }
            lists.add(list);
            count ++;

        }
        return lists;
    }
}
