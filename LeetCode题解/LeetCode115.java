public class LeetCode115 {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int h = t.length();
        int l = s.length();
        this.dp = new int[h + 1][l + 1];
        for (int i = 0; i < l + 1; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < l + 1; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1)){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[h][l];
    }
}
