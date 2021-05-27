import java.util.ArrayDeque;
import java.util.Queue;

public class LeetCode117 {
    public Node connect(Node root) {
        Node node = new Node();
        if (root == null){
            return null;
        }
        if (root.left == null && root.right == null)
            root.next = null;
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node p = queue.poll();
            Node q = new Node();
            for (int i = 0; i < size; i++) {
                if (queue.isEmpty() || i == size -1){
                    p.next = null;
                }else {
                    q = queue.poll();
                    p.next = q;
                }
                if (p.left != null){
                    queue.add(p.left);
                }
                if (p.right != null){
                    queue.add(p.right);
                }
                p = q;
            }
        }
        return root;
    }
}
