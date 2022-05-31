class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (String str : wordDict) {
                int lens = str.length();
                if (i >= lens && s.substring(i - lens, i).equals(str)) dp[i] = dp[i] || dp[i - lens];
            }
        }
        return dp[len];
    }
}
