package Top100;

import java.util.*;

public class Top347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[k];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int a = nums[i];
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (o1, o2) ->{
            return o2.getValue().compareTo(o1.getValue());
        } );
        int count = 0;
        for (Map.Entry<Integer, Integer> m :
                list) {
            if (count == k)
                break;
            res[count++] = m.getKey();
        }
        return res;
    }
}
