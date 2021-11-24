public class Top114 {
    TreeNode pre = null;
    public void flatten(TreeNode root) {
        while (root != null){
            TreeNode left = root.left;
            if (left != null){
                while (left.right != null){
                    left = left.right;
                }
                left.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
