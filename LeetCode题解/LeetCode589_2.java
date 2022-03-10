import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode589 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        Stack<Node> stack = new Stack<>();
        if (root != null)
            stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            res.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--) {
                stack.push(root.children.get(i));
            }
        }
        return res;
    }
}
