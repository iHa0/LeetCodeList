/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("x,");
            } else {
                sb.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        TreeNode root = new TreeNode(Integer.parseInt(nodes.poll()));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            String left = nodes.poll();
            String right = nodes.poll();
            if (!left.equals("x")) {
                node.left = new TreeNode(Integer.parseInt(left));
                queue.add(node.left);
            }
            if (!right.equals("x")) {
                node.right = new TreeNode(Integer.parseInt(right));
                queue.add(node.right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
