public class Top55_2 {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if (dp[0] == 0 && nums.length != 1)
            return false;
        if (dp[0] == 0 && nums.length == 1)
            return true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= dp[i - 1] - 1){
                dp[i] = nums[i];
            }else
                dp[i] = dp[i - 1] - 1;
            if (dp[i] == 0 && i != nums.length - 1)
                return false;
        }
        return true;
    }
}
