public class LeetCode55 {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if (len == 1 && nums[0] >= 0){
            return true;
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = Math.max( dp[i - 1], i + nums[i]);
        }
        for (int i = 0; i < len; i++) {
            if (dp[i] <= i){
                if (i == len -1){
                    return true;
                }else {
                    return false;
                }
            }

        }
        return true;
    }
}
