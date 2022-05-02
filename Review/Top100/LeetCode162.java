class Solution {
    public int findPeakElement(int[] nums) {
        int len = nums.length + 2;
        int[] newnums = new int[len];
        newnums[0] = Integer.MIN_VALUE;
        newnums[len - 1] = Integer.MIN_VALUE;
        for (int i = 1; i <= len - 2; i++) {
            newnums[i] = nums[i - 1];
        }
        int left = 1, right = len - 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (newnums[mid] > newnums[mid + 1] && newnums[mid] > newnums[mid - 1]) return mid - 1;
            else if (newnums[mid - 1] < newnums[mid] || newnums[mid] < newnums[mid + 1]) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }
}
