class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (String a : wordDict) {
                int size = a.length();
                if (i >= size && s.substring(i - size, i).equals(a)) {
                    dp[i] = dp[i] || dp[i - size];
                }
            }
        }
        return dp[len];
    }
}
