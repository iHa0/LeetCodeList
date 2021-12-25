package TopInterview;

public class TopInterview88_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, len = m + n;
        while (p2 >= 0){
            if (p1 < 0 || nums2[p2] >= nums1[p1]){
                nums1[--len] = nums2[p2--];
            }else {
                nums1[--len] = nums1[p1--];
            }
        }
    }
}
