class Solution {
    int res;
    public int reversePairs(int[] nums) {
        int len = nums.length;
        mergeSort(nums, 0, len - 1, new int[len]);
        return res;
    }

    private void mergeSort(int[] nums, int left, int right, int[] temp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid, temp);
            mergeSort(nums, mid + 1, right, temp);
            sort(nums, left, mid, right, temp);
        }
    }

    private void sort(int[] nums, int left, int mid, int right, int[] temp) {
        int i = left, j = mid + 1, t = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[t++] = nums[i++];
            } else  {
                res += mid - i + 1;
                temp[t++] = nums[j++];
            }
        }
        while (i <= mid) temp[t++] = nums[i++];
        while (j <= right) temp[t++] = nums[j++];
        for (int k = left; k <= right; k++) {
            nums[k] = temp[k - left];
        }
    }
}
