import java.util.*;

public class CodingInterviews32_3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();
        if (root == null){
            return resList;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        queue.add(root);
        TreeNode p = root;
        while (!queue.isEmpty()){
            int len = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                p = queue.poll();

                if (p.left != null){
                    queue.add(p.left);
                }
                if (p.right != null){
                    queue.add(p.right);
                }
                if (count % 2 == 0){
                    stack.add(p.val);
                }else {
                    list.add(p.val);
                }
            }
            List<Integer> qlist = new ArrayList<>();
            while (!stack.isEmpty()){
                qlist.add(stack.pop());
            }
            if (count % 2 == 0){
                resList.add(qlist);
            }else {
                resList.add(list);
            }
            count++;
        }
        return resList;
    }
}
