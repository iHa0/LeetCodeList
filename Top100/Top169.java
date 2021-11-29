package Top100;

import java.util.HashMap;
import java.util.Set;

public class Top169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        int sizeMost = nums.length / 2 + 1;
        Set<Integer> set = hashMap.keySet();
        for (int b:
             set) {
            if (hashMap.get(b) >= sizeMost)
                return b;
        }
        return 0;
    }
}
