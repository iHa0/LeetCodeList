package Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        int[] temp = new int[len + 1];
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            temp[n]++;
        }
        for (int i = 1; i < len + 1; i++) {
            if (temp[i] == 0)
                res.add(i);
        }
        return res;
    }
}

