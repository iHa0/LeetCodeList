class Solution {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[len - 1] == 0) return true;
        int pivot = 0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) pivot++;
            else {
                if (nums[i] == nums[i + 1]) return false;
            }
        }
        if (nums[4] - nums[pivot] < 5) return true;
        return false;
    }
}
