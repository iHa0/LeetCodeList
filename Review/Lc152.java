class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int imax = 1, imin = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                int temp = imin;
                imin = imax;
                imax = temp;
            }
            imax = Math.max(nums[i], nums[i] * imax);
            imin = Math.min(nums[i], nums[i] * imin);
            max = Math.max(max, imax);
        }
        return max;
    }
}
