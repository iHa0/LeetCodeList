class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1, left = m - 1, right = n - 1;
        while (index >= 0) {
            if (left >= 0 && right >= 0 && nums1[left] >= nums2[right] || right < 0) {
                nums1[index--] = nums1[left--];
            } else if (left >= 0 && right >= 0 && nums1[left] < nums2[right] || left < 0) {
                nums1[index--] = nums2[right--];
            }
        }
    }
}
