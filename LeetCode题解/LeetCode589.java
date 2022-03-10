import java.util.ArrayList;
import java.util.List;

public class LeetCode589 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        dfs(root);
        return res;
    }

    private void dfs(Node root) {
        if (root == null)
            return;
        res.add(root.val);
        for (Node node : root.children) {
            dfs(node);
        }
    }
}
