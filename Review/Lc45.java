class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int max = 0, step = 0, end = 0;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == end) {
                end = max;
                step++;
            }
        }
        return step;
    }
}
