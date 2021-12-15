package Top100;

public class Top538 {
    int cur;
    public TreeNode convertBST(TreeNode root) {
        this.cur = 0;
        dfs(root);
        return root;
    }
    public void dfs(TreeNode node){
        if (node == null)
            return;
        dfs(node.right);
        node.val = node.val + cur;
        cur = node.val;
        dfs(node.left);
    }
}
