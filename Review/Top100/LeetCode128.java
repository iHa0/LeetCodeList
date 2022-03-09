import java.util.HashSet;
import java.util.Set;

public class LeetCode128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            set.add(a);
        }
        int ans = 0;
        for (int a : set) {
            if (!set.contains(a - 1)){
                int cur = a, count = 0;
                while (set.contains(cur + 1)){
                    cur++;
                    count++;
                }
                ans = Math.max(ans, count + 1);
            }
        }
        return ans;
    }
}
