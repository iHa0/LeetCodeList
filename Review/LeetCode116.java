public class LeetCode116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null)
            return null;
        dfs(root);
        return root;
    }

    private void dfs(Node root) {
        if (root == null || root.left == null)
            return;
        if (root.next != null){
            root.right.next = root.next.left;
        }
        root.left.next = root.right;
        dfs(root.left);
        dfs(root.right);
    }
}
