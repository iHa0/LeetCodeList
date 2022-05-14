class Solution {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean hasOne = false;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) hasOne = true;
            if (nums[i] <= 0 || nums[i] > len) nums[i] = 1;
        }
        if (!hasOne) return 1;
        for (int i = 0; i < len; i++) {
            int cur = Math.abs(nums[i]) - 1;
            nums[cur] = -Math.abs(nums[cur]);
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) return i + 1;
        }
        return len + 1;
    }
}
