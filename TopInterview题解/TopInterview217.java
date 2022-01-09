package TopInterview;

import java.util.HashSet;

public class TopInterview217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int a = nums[i];
            if (hashSet.contains(a))
                return true;
            hashSet.add(a);
        }
        return false;
    }
}
