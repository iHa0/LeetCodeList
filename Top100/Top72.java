public class Top72 {
    public int minDistance(String word1, String word2) {
        int l = word1.length(), h = word2.length();
        int[][] dp = new int[h + 1][l + 1];
        dp[0][0] = 0;
        for (int i = 1; i < l + 1; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i < h + 1; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i < h + 1; i++) {
            for (int j = 1; j < l + 1; j++) {
                if (word1.charAt(j - 1) == word2.charAt(i - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = returnMin(dp[i - 1][j - 1], dp[i][j - 1], dp[i - 1][j]) + 1;
                }
            }
        }
        return dp[h][l];
    }

    public int returnMin(int a, int b, int c){
        int temp = Math.min(a, b);
        return Math.min(temp, c);
    }
}
