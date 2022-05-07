class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int imax = 1, imin = 1, max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i], imax * nums[i]);
            imin = Math.min(nums[i], imin * nums[i]);
            max = Math.max(max, imax);
        }
        return max;
    }
}
