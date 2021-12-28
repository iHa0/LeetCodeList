package TopInterview;

public class TopInterview108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        return bulid(nums, left, right);
    }
    public TreeNode bulid(int[] nums, int left, int right){
        if (left > right)
            return null;
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bulid(nums, left, mid - 1);
        node.right = bulid(nums, mid + 1, right);
        return node;
    }
}
