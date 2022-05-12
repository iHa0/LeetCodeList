/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class ColorNode {
        String color;
        TreeNode node;
        ColorNode(TreeNode node, String color) {
            this.node = node;
            this.color = color;
        }
    }

    List<Integer> res = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return res;
        Stack<ColorNode> stack = new Stack<>();
        stack.add(new ColorNode(root, "w"));
        while (!stack.isEmpty()) {
            ColorNode cn = stack.pop();
            if (cn.color.equals("w")) {
                stack.add(new ColorNode(cn.node, "g"));
                if (cn.node.right != null) stack.add(new ColorNode(cn.node.right, "w"));
                if (cn.node.left != null) stack.add(new ColorNode(cn.node.left, "w"));
            } else {
                res.add(cn.node.val);
            }
        }
        return res;
    }
}
