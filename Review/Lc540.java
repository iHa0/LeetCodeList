class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) {
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) left = mid + 1;
                else right = mid;
            } else {
                if (mid + 1 < len && nums[mid] == nums[mid + 1]) left = mid + 1;
                else right = mid;
            }
        }
        return nums[right];
    }
}
