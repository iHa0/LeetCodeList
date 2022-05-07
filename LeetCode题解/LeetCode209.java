class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int left = 0, right = 0;
        int sum = 0, min = Integer.MAX_VALUE;
        while (right < len) {
            int a = nums[right++];
            sum += a;
            while (sum >= target) {
                int b = nums[left++];
                if (min > right - left) {
                    min = right - left + 1;
                }
                sum -= b;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
