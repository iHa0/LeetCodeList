package TopInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopInterview347 {
    public int[] topKFrequent(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[k];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a : nums) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (o1, o2) -> {
            return o2.getValue() - o1.getValue();
        });
        int count = 0;
        for (Map.Entry<Integer, Integer> m : list) {
            if (count == k)
                break;
            res[count++] = m.getKey();
        }
        return res;
    }
}
