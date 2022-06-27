class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverseNums(nums, 0, len - 1);
        reverseNums(nums, 0, k - 1);
        reverseNums(nums, k, len - 1);
    }

    private void reverseNums(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
