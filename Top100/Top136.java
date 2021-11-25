import java.util.HashMap;
import java.util.Set;

public class Top136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i:
             nums) {
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = hashMap.keySet();
        for (int i:
             set) {
            if (hashMap.get(i) == 1)
                return i;
        }
        return 0;
    }
}
