class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1, l2 = n - 1, t = nums1.length - 1;
        while (t >= 0) {
            if (l1 >= 0 && l2 >= 0 && nums1[l1] >= nums2[l2] || l2 < 0) {
                nums1[t--] = nums1[l1--];
            } else if (l1 >= 0 && l2 >= 0 && nums1[l1] < nums2[l2] || l1 < 0) {
                nums1[t--] = nums2[l2--];
            }
        }
    }
}
