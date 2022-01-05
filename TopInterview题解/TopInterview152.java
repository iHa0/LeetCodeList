package TopInterview;

public class TopInterview152 {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE, imax = 1, imin = 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0){
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(nums[i], nums[i] * imax);
            imin = Math.min(nums[i], nums[i] * imin);
            max = Math.max(max, imax);
        }
        return max;
    }
}
