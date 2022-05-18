class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] dp = new int[m + 1][n + 1];
        int zeroCount = 0, oneCount = 0;
        for (String a : strs) {
            zeroCount = 0;
            oneCount = 0;
            for (char c : a.toCharArray()) {
                if (c == '0') zeroCount++;
                if (c == '1') oneCount++;
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
