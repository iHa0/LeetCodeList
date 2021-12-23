package TopInterview;

public class TopInterview55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            if (dp[i - 1] >= i){
                dp[i] = Math.max(dp[i - 1], nums[i] + i);
            }else{
                return false;
            }
        }
        return true;
    }
}
