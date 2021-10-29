class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int new_length = nums1.length + nums2.length;
        int[] a = new int[new_length];
        int n = 0, i, j;
        for (; n < new_length; n++) {
            if (n < nums1.length){
                a[n] = nums1[n];
            }else {
                a[n] = nums2[n - nums1.length];
            }
        }
        Arrays.sort(a);
        if (new_length % 2 == 0){
            return (a[new_length / 2 - 1] + a[new_length / 2]) / 2.0;
        }else {
            return (double) a[new_length / 2];
        }
    }
}
