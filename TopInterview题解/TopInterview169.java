package TopInterview;

import java.util.Arrays;

public class TopInterview169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
