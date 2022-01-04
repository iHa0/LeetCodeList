package TopInterview;

public class TopInterview134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int[] dp = new int[len];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            dp[i] = gas[i] - cost[i];
            max = Math.max(max, dp[i]);
            min = Math.min(min, dp[i]);
        }
        if (max == 0 && min == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (dp[i] <= 0)
                continue;
            for (int j = 0; j < len; j++) {
                if (sum < 0)
                    break;
                sum += dp[(i + j) % len];
            }
            if (sum >= 0){
                return i;
            }
            sum = 0;
        }
        return -1;
    }
}
