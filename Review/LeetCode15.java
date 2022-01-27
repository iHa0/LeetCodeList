package Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int i1 = nums[i];
            int left = i + 1, right = len - 1;
//            while (left < len && nums[left] == i1) left++;
            while (left < right){
                if (i1 + nums[left] + nums[right] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(i1);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                    continue;
                }
                if (i1 + nums[left] + nums[right] < 0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return res;
    }
}
