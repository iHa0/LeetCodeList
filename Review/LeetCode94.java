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
        TreeNode node;
        String color;
        public ColorNode(TreeNode node, String color) {
            this.node = node;
            this.color = color;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<>();
        Stack<ColorNode> stack = new Stack<>();
        stack.push(new ColorNode(root, "white"));
        while (!stack.isEmpty()) {
            ColorNode cn = stack.pop();
            if (cn.color.equals("white")) {
                if (cn.node.right != null) stack.push(new ColorNode(cn.node.right, "white"));
                stack.push(new ColorNode(cn.node, "gray"));
                if (cn.node.left != null) stack.push(new ColorNode(cn.node.left, "white"));
            } else {
                res.add(cn.node.val);
            }
        }
        return res;
    }
}
