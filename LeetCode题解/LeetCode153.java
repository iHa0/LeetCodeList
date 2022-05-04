class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int a = nums[left];
            int b = nums[right];
            int c = nums[mid];
            if (a > b) {
                if (c < b) right = mid;
                else left = mid + 1;
            } else {
                return a;
            }
        }
        return -1;
    }
}
