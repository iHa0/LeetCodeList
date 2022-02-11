package Review;

import java.util.Arrays;

public class LeetCode1984 {
    public int minimumDifference(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        int left = 0, right = k - 1;
        int min = Integer.MAX_VALUE;
        while (right < len){
            int gap = nums[right] - nums[left];
            min = Math.min(min, gap);
            left++;
            right++;
        }
        return min;
    }
}
