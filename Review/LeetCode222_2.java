public class LeetCode222_2 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int left = countLevel(root.left);
        int right = countLevel(root.right);
        if (left == right){
            return (int) (countNodes(root.right) + Math.pow(2, left));
        } else {
            return (int) (countNodes(root.left) + Math.pow(2, right));
        }
    }

    private int countLevel(TreeNode root) {
        int level = 0;
        while (root != null){
            level++;
            root = root.left;
        }
        return level;
    }
}
