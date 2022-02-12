package Top100Review;

public class Lc10 {
    String s, p;
    int len1, len2;
    boolean[][] dp;
    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        this.len1 = s.length();
        this.len2 = p.length();
        this.dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for (int i = 0; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (p.charAt(j - 1) == '*'){
                    dp[i][j] = dp[i][j - 2];
                    if (match(i, j - 1)){
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    if (match(i, j))
                        dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[len1][len2];
    }

    public boolean match(int i, int j){
        if (i == 0)
            return false;
        if (p.charAt(j - 1) == '.')
            return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
