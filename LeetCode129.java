public class LeetCode129 {
    int sum = 0 ;
    public int sumNumbers(TreeNode root) {
        int cur = 0;
        returnSum(root , cur);
        return sum;
    }

    public void returnSum(TreeNode root , int cur){
        if (root == null){
            return;
        }
        cur = cur * 10 + root.val;
        if (root.left == null && root.right == null){
            sum += cur;
        }
        returnSum(root.left , cur);
        returnSum(root.right , cur);
    }
}
