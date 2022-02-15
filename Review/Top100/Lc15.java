package Top100Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int index;
        for (index = 0; index < len; index++) {
            if (index > 0 && nums[index] == nums[index - 1])
                continue;
            int left = index + 1, right = len - 1;
            int target = -nums[index];
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[index]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum > target){
                    right--;
                } else
                    left++;
            }
        }
        return res;
    }
}
