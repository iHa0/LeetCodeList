package Review;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode16_2 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len - 2; i++) {
            int i1 = nums[i];
            int left = i + 1, right = len - 1;
            while (left < right){
                int sum = i1 + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(res - target))
                    res = sum;
                if (sum == target)
                    return sum;
                if (sum > target)
                    right--;
                else
                    left++;
            }
        }
        return res;
    }
}
