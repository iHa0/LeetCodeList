class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean hasOne = false;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) hasOne = true;
            if (nums[i] <= 0 || nums[i] > len) nums[i] = 1;
        }
        if (!hasOne) return 1;
        for (int i = 0; i < len; i++) {
            int cur = Math.abs(nums[i]);
            nums[cur - 1] = - Math.abs(nums[cur - 1]);
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return i + 1;
        }
        return len + 1;
    }
}
