package Top100;

import java.util.ArrayList;
import java.util.List;

public class Top448_2 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int index = (nums[i] - 1) % len;
            nums[index] += len;
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] <= len)
                res.add(i + 1);
        }
        return res;
    }
}
