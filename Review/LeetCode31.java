class Solution {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i, j;
        for (i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) break;
        }
        if (i < 0) {
            Arrays.sort(nums);
            return;
        }
        for (j = len - 1; j >= 0; j--) {
            if (nums[j] > nums[i]) break;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        Arrays.sort(nums, i + 1, len);
    }
}
