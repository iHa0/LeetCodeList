package TopInterview;

public class TopInterview116 {
    public Node connect(Node root) {
        dfs(root);
        return root;
    }
    public void dfs(Node node){
        if (node == null || node.left == null)
            return;
        node.left.next = node.right;
        if (node.next != null){
            node.right.next = node.next.left;
        }
        dfs(node.left);
        dfs(node.right);
    }
}
