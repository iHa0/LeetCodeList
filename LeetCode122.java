public class LeetCode122 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1)
            return 0;
        int[] dp = new int[len];
        int res = 0;
        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i - 1]){
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
