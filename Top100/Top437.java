package Top100;

public class Top437 {
    int res = 0;
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        inOrder(root, targetSum);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return res;
    }
    public void inOrder(TreeNode node, int target){
        if (node == null)
            return;
        if (node.val == target)
            res++;
        inOrder(node.right, target - node.val);
        inOrder(node.left, target - node.val);
    }
}
