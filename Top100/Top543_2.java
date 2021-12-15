package Top100;

public class Top543_2 {
    int res = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode node){
        if (node == null)
            return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);
        res = Math.max(res, left + right);
        return Math.max(left, right) + 1;
    }
}
