import java.util.HashMap;
import java.util.Map;

public class LeetCode525 {
    public int findMaxLength(int[] nums) {
        int len = nums.length;
        int cur = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0)
                cur--;
            else
                cur++;
            if (map.containsKey(cur)){
                ans = Math.max(ans, i - map.get(cur));
            } else
                map.put(cur, i);
        }
        return ans;
    }
}
