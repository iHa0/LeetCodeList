package TopInterview;

import java.util.*;

public class TopInterview103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int count = 0;
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        if (root == null)
            return res;
        queue.add(root);
        List<Integer> list = new LinkedList<>();
        list.add(root.val);
        res.add(list);
        while (!queue.isEmpty()){
            int size = queue.size();
            list = new LinkedList<>();
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
            if (count % 2 == 0){
                int listSize = list.size();
                for (int i = 0; i < listSize; i++) {
                    stack.add(list.get(0));
                    list.remove(0);
                }
                for (int i = 0; i < listSize; i++) {
                    list.add(stack.pop());
                }
            }
            if (list.size() > 0){
                res.add(list);
                count++;
            }
        }
        return res;
    }
}
