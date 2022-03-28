class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int flag = nums[0];
        for (int i = 0; i < len; i++) {
            if (flag >= i) {
                flag = Math.max(i + nums[i], flag);
            } else {
                return false;
            }
        }
        return true;
    }
}
