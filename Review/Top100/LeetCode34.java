class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int l = mid, r = mid;
                while (l >= 0 && nums[l] == nums[mid]) l--;
                while (r < len && nums[r] == nums[mid]) r++;
                res[0] = l + 1;
                res[1] = r - 1;
                return res;
            }
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return new int[]{-1, -1};
    }
}
