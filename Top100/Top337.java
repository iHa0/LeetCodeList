package Top100;

public class Top337 {
    public int rob(TreeNode root) {
        int[] list = lastOrder(root);
        return Math.max(list[0], list[1]);
    }

    public int[] lastOrder(TreeNode root){
        int[] rootList = new int[2];
        if (root == null && root == null){
            rootList[0] = 0;
            rootList[1] = 0;
            return rootList;
        }
        int[] left = lastOrder(root.left);
        int[] right = lastOrder(root.right);
        rootList[0] = root.val + left[1] + right[1];
        rootList[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return rootList;
    }
}
