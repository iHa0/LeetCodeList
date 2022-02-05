package Review;

import java.util.HashMap;

public class LeetCode1748 {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : nums) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        int res = 0;
        for (int a : hashMap.keySet()) {
            if (hashMap.get(a) == 1)
                res += a;
        }
        return res;
    }
}
