class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int res = 0, zero = 0;
        int left = 0, right = 0;
        while (right < len) {
            int a = nums[right++];
            if (a == 0) zero++;
            while (zero > k) {
                if (nums[left++] == 0) zero--;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
