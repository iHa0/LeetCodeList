class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int left = len - 2, right = len - 1;
        while (left >= 0) {
            if (nums[left] < nums[left + 1]) break;
            left--;
        }
        if (left < 0) {
            Arrays.sort(nums);
            return;
        }
        while (right >= 0) {
            if (nums[right] > nums[left]) break;
            right--;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        Arrays.sort(nums, left + 1, len);
    }
}
