package TopInterview;

import java.util.HashMap;

public class TopInterview350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] more, less;
        if (len1 > len2){
            more = nums1;
            less = nums2;
        }else {
            more = nums2;
            less = nums1;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[less.length];
        int k = 0;
        for (int a : more) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        for (int b : less) {
            if (hashMap.containsKey(b)){
                res[k++] = b;
                hashMap.put(b, hashMap.get(b) - 1);
                if (hashMap.get(b) == 0)
                    hashMap.remove(b);
            }
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = res[i];
        }
        return ans;
    }
}
