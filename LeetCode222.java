public class LeetCode222 {
  
    int count = 0;
  
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        preOrder(root);
        return count;
    }

    public void preOrder(TreeNode root){
        if (root == null){
            return;
        }
        count ++;
        preOrder(root.left);
        preOrder(root.right);
    }
}
