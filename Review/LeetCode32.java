class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        int[] dp = new int[len];
        int max = 0;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i > 1 ? dp[i - 2] : 0) + 2;
                } else {
                    if (i > dp[i - 1] && s.charAt(i - dp[i - 1] - 1) == '(') {
                        dp[i] = ((i - dp[i - 1] - 2) > 0 ? dp[i - dp[i - 1] - 2] : 0) + dp[i - 1] + 2;
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
