class Solution {
    public int jump(int[] nums) {
        int len = nums.length, end = 0, max = 0, res = 0;
        for (int i = 0; i < len - 1; i++) {
            max = Math.max(nums[i] + i, max);
            if (i == end) {
                end = max;
                res++;
            }
        }
        return res;
    }
}
