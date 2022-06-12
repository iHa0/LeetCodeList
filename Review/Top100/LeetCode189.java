class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
