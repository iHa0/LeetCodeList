package Top100;

import java.util.HashMap;

public class Top560 {
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        if (len == 0)
            return 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int sum = 0, res = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            if (hashMap.containsKey(sum - k)){
                res += hashMap.get(sum - k);
            }
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}
