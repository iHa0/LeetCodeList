import java.util.HashMap;

public class LeetCode2006 {
    public int countKDifference(int[] nums, int k) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];
            if (hashMap.containsKey(cur + k)){
                res += hashMap.get(cur + k);
            }
            if (hashMap.containsKey(cur - k)){
                res += hashMap.get(cur - k);
            }
            hashMap.put(cur, hashMap.getOrDefault(cur, 0) + 1);
        }
        return res;
    }
}
