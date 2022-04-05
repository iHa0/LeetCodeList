class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0, right = 0;
        int max = 0, zero = 0;
        while (right < len) {
            int a = nums[right++];
            if (a == 0) zero++;
            while (zero > k) {
                int b = nums[left++];
                if (b == 0) zero--;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}
