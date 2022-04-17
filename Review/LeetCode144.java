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
        public ColorNode(TreeNode node, String color) {
            this.node = node;
            this.color = color;
        }
    }

    List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return res;
        Stack<ColorNode> stack = new Stack<>();
        stack.push(new ColorNode(root, "w"));
        while (!stack.isEmpty()) {
            ColorNode cn = stack.pop();
            if (cn.color.equals("w")) {
                
                if (cn.node.right != null) stack.push(new ColorNode(cn.node.right, "w"));
                if (cn.node.left != null) stack.push(new ColorNode(cn.node.left, "w"));
                stack.push(new ColorNode(cn.node, "g"));
            } else {
                res.add(cn.node.val);
            }
        }
        return res;
    }
}
