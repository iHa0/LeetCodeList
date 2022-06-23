class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length, zeroCount = 0, oneCount = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            zeroCount = 0;
            oneCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zeroCount++;
                else oneCount++;
            }
            for (int i = m; i >= zeroCount; i--) {
                for (int j = n; j >= oneCount; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroCount][j - oneCount] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
