package Top100;

public class Top236 {
    TreeNode res;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lastOrder(root, p, q);
        return res;
    }
    public int lastOrder(TreeNode root, TreeNode p, TreeNode q){
        if (root == null || res != null)
            return 0;
        int flag = 0, lFlag = 0, rFlag = 0, curFlag = 0;

        if (root == p || root == q){
            curFlag++;
            flag = 1;
        }
        lFlag += lastOrder(root.left, p, q);
        rFlag += lastOrder(root.right, p, q);
        if (lFlag != 0 || rFlag != 0)
            flag = 1;
        int sum = curFlag + lFlag + rFlag;
        if (sum == 2){
            res = root;
            return 0;
        }
        return flag;
    }
}
