class Solution {
    public int numDistinct(String s, String t) {
        int h = t.length(), l = s.length();
        int[][] dp = new int[h + 1][l + 1];
        for (int i = 0; i <= l; i++) dp[0][i] = 1;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (s.charAt(j - 1) == t.charAt(i - 1)) dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                else dp[i][j] = dp[i][j - 1];
            }
        }
        return dp[h][l];
    }
}
