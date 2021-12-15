package Top100;

public class Top617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        dfs(root1, root2);
        return root1;
    }
    public void dfs(TreeNode node1, TreeNode node2){
        if (node2 == null || node1 == null)
            return;
        if (node1 != null && node2 != null)
            node1.val += node2.val;
        if (node1.left == null && node2.left != null){
            node1.left = node2.left;
            node2.left = null;
        }
        if (node1.right == null && node2.right != null){
            node1.right = node2.right;
            node2.right = null;
        }
        dfs(node1.left, node2.left);
        dfs(node1.right, node2.right);
    }
}
