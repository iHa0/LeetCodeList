class Solution {
    public int minDistance(String word1, String word2) {
        int h = word1.length(), l = word2.length();
        int[][] dp = new int[h + 1][l + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= h; i++) {
            dp[i][0] = i;
        }
        for (int j = 1; j <= l; j++) {
            dp[0][j] = j;
        }
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]),dp[i][j - 1]) + 1;
                }
            }
        }
        return dp[h][l];
    }
}
