package TopInterview;

public class TopInterview124 {
    int max;
    public int maxPathSum(TreeNode root) {
        this.max = Integer.MIN_VALUE;
        last(root);
        return max;
    }
    public int last(TreeNode node){
        if (node == null)
            return 0;
        int left = Math.max(last(node.left), 0);
        int right = Math.max(last(node.right), 0);
        max = Math.max(max, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
