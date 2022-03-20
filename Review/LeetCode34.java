class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int[] res = new int[2];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int l = mid, r = mid;
                while (l >= 0 && nums[l] == target) l--;
                while (r < len && nums[r] == target) r++;
                res[0] = l + 1;
                res[1] = r - 1;
                return res;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        res[0] = -1;
        res[1] = -1;
        return res;
    }
}
