import java.util.*;

public class LeetCode113 {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> deque = new ArrayDeque<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        dfs(root, targetSum);
        return res;
    }
    public void dfs(TreeNode root , int targetSum){
        if (root == null){
            return ;
        }
        deque.addLast(root.val);
        int sum = targetSum - root.val;
        if (sum == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(deque));
        }
        dfs(root.left , sum);
        dfs(root.right , sum);
        deque.pollLast();
    }
}
