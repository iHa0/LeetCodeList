import java.util.Arrays;

public class LeetCode1567 {
    public int getMaxLen(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0] > 0 ? 1 : 0;
        int[] dp = new int[len];
        int q = 1, p = -1;
        if (nums[0] > 0){
            dp[0] = 1;
        }else if (nums[0] < 0){
            dp[0] = 0;
            q = nums[0];
            p = 0;
        }else {
            dp[0] = 0;
        }
        for (int i = 1; i < len; i++) {
            if (nums[i] < 0 && p == -1){
                p = i;
            }
            if (nums[i] > 0 && nums[i - 1] > 0)
                dp[i] = dp[i - 1] + 1;
            if (nums[i - 1 ] <= 0 && nums[i] > 0){
                dp[i] = dp[i - 1] + 1;
            }
            if (nums[i] < 0){
//                q *= nums[i];
                if (q > 0){
                    if (nums[i] > 0){
                        q = 1;
                    }else {
                        q = -1;
                    }
                }else {
                    if (nums[i] > 0){
                        q = -1;
                    }else {
                        q = 1;
                    }
                }
                dp[i] = 0;
                if (q > 0 && p == 0){
                    dp[i] = i - p + 1;
                }
                if (q > 0 && p != 0){
                    dp[i] = i - p + 1 + dp[p - 1];
                }
            }
            if (nums[i] == 0){
                p = -1;
                dp[i] = 0;
                q = 1;
            }
        }


        int[] dp2 = new int[len];
        int qq = 1, pp = -1;
        if (nums[len - 1] > 0){
            dp2[len - 1] = 1;
        }else if (nums[len - 1] < 0){
            dp2[len - 1] = 0;
            qq = nums[len - 1];
            pp = len - 1;
        }else {
            dp2[len - 1] = 0;
        }
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < 0 && pp == -1){
                pp = i;
            }
            if (nums[i] > 0 && nums[i + 1] > 0)
                dp2[i] = dp2[i + 1] + 1;
            if (nums[i + 1 ] <= 0 && nums[i] > 0){
                dp2[i] = dp2[i + 1] + 1;
            }
            if (nums[i] < 0){
//                q *= nums[i];
                if (qq > 0){
                    if (nums[i] > 0){
                        qq = 1;
                    }else {
                        qq = -1;
                    }
                }else {
                    if (nums[i] > 0){
                        qq = -1;
                    }else {
                        qq = 1;
                    }
                }
                dp2[i] = 0;
                if (qq > 0 && pp == len - 1){
                    dp2[i] = pp - i + 1;
                }
                if (qq > 0 && pp != len - 1){
                    dp2[i] = pp - i + 1 + dp2[pp + 1];
                }
            }
            if (nums[i] == 0){
                pp = -1;
                dp2[i] = 0;
                qq = 1;
            }
        }

        return Math.max(Arrays.stream(dp).max().getAsInt(), Arrays.stream(dp2).max().getAsInt());
    }
}
