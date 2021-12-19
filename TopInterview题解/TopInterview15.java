package TopInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TopInterview15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len <= 2)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            int left = i + 1, right = len - 1;
            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    if (!res.contains(list)){
                        res.add(list);
                    }
                    left++;
                    right--;
                }
                if (sum > target){
                    right--;
                }
                if (sum < target){
                    left++;
                }
            }
        }
        return res;
    }
}
