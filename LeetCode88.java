import java.util.Arrays;

public class LeetCode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nn = 0;
        for (int i = m; i < n + m; i++) {
            nums1[i] = nums2[nn++];
        }
        Arrays.sort(nums1);
    }
}
