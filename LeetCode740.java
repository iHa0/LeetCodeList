import java.util.Arrays;

public class LeetCode740 {
    public int deleteAndEarn(int[] nums) {
        int max_len = Arrays.stream(nums).max().getAsInt();
        int[] coll = new int[max_len];
        for (int a :
                nums) {
            coll[a - 1] += a;
        }
        int len = coll.length;
        if (len == 1)
            return coll[0];
        int[] dp = new int[len];
        dp[0] = coll[0];
        dp[1] = coll[1];
        for (int i = 2; i < len; i++) {
            int[] temp = Arrays.copyOfRange(dp, 0, i - 1);
            int max = Arrays.stream(temp).max().getAsInt();
            dp[i] = max + coll[i];
        }
        return Arrays.stream(dp).max().getAsInt();
    }

}
