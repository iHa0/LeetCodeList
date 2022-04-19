class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1, i = m - 1, j = n - 1;
        while (index >= 0) {
            int a = i >= 0 ? nums1[i] : Integer.MIN_VALUE;
            int b = j >= 0 ? nums2[j] : Integer.MIN_VALUE;
            if (a > b) {
                nums1[index--] = a;
                i--;
            } else {
                nums1[index--] = b;
                j--;
            }
        } 
    }
}
