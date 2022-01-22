package TopInterview;

import java.util.HashMap;

public class TopInterview454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                hashMap.put(a + b, hashMap.getOrDefault(a + b , 0) + 1);
            }
        }
        int res = 0;
        for (int c : nums3) {
            for (int d : nums4) {
                res += hashMap.getOrDefault(-(c + d), 0);
            }
        }
        return res;
    }
}
