package TopInterview;

public class TopInterview152_2 {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE, sum = 1;
        for (int i = 0; i < len; i++) {
            sum *= nums[i];
            max = Math.max(sum, max);
            if (nums[i] == 0)
                sum = 1;
        }
        sum = 1;
        for (int i = len - 1; i >= 0; i--) {
            sum *= nums[i];
            max = Math.max(sum, max);
            if (nums[i] == 0)
                sum = 1;
        }
        return max;
    }
}
