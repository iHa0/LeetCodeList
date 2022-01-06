package TopInterview;

public class TopInterview169_2 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int m = 0, pivot = 0;
        for (int i = 0; i < len; i++) {
            if (m == 0)
                pivot = nums[i];
            m += pivot == nums[i] ? 1 : -1;
        }
        return pivot;
    }
}
