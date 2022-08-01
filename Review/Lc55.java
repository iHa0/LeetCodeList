class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int flag = nums[0];
        for (int i = 0; i < len; i++) {
            if (flag >= i) {
                flag = Math.max(flag, i + nums[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
