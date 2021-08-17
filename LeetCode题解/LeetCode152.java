import java.util.Arrays;

public class LeetCode152 {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] dp1 = new int[len];
        int[] dp2 = new int[len];
        dp1[len - 1] = nums[len - 1];
        dp2[0] = nums[0];
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i + 1] == 0){
                dp1[i] = nums[i];
                continue;
            }
            if (nums[i] == 0){
                dp1[i] = 0;
                continue;
            }
            dp1[i] = dp1[i + 1] * nums[i];
        }
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] == 0){
                dp2[i] = nums[i];
                continue;
            }
            if (nums[i] == 0){
                dp2[i] = 0;
                continue;
            }
            dp2[i] = dp2[i - 1] * nums[i];
        }
        return Math.max(Arrays.stream(dp1).max().getAsInt(), Arrays.stream(dp2).max().getAsInt());
    }
}
