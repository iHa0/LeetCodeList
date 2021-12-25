package TopInterview;

public class TopInterview91 {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != '0'){
                dp[i + 1] += dp[i];
            }
            if (i > 0 && s.charAt(i - 1) != '0' && (s.charAt(i - 1) - '0')* 10 + (s.charAt(i) - '0') <= 26){
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[len];
    }
}
