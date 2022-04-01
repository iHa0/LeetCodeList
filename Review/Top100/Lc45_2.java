class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0, step = 0, flag = nums[0];
        for (int i = 0; i < len - 1; i++) {
            flag = Math.max(flag, i + nums[i]);
            if (i == end) {
                step++;
                end = flag;
            }
        }
        return step;
    }
}
