class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int h = text1.length(), l = text2.length();
        int[][] dp = new int[h + 1][l + 1];
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[h][l];
    }
}
