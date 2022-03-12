import java.util.ArrayList;
import java.util.List;

public class LeetCode590 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root == null)
            return res;
        dfs(root);
        res.add(root.val);
        return res;
    }

    private void dfs(Node root) {
        if (root == null)
            return;
        for (Node node : root.children) {
            dfs(node);
            res.add(node.val);
        }
    }
}
