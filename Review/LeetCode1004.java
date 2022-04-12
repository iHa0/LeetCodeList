class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length, left = 0, right = 0;
        int zero = 0, res = 0;
        while (right < len) {
            int a = nums[right++];
            if (a == 0) zero++;
            while (zero > k) {
                int b = nums[left++];
                if (b == 0) zero--;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }
}
