class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean hasOne = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) hasOne = true;
            if (nums[i] <= 0 || nums[i] > len) nums[i] = 1;
        }
        if (hasOne != true) return 1;
        for (int i = 0; i < len; i++) {
            nums[Math.abs(nums[i]) - 1] = Math.abs(nums[Math.abs(nums[i]) - 1]) * -1;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] >= 0) return i + 1;
        }
        return len + 1;
    }
}
