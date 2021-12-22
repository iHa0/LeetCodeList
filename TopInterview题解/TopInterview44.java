package TopInterview;

public class TopInterview44 {
    boolean[][] dp;
    int h, l;
    String s, p;
    public boolean isMatch(String s, String p) {
        this.h = s.length();
        this.l = p.length();
        this.s = s;
        this.p = p;
        this.dp = new boolean[h + 1][l + 1];
        dp[0][0] = true;
        for (int i = 0; i <= h; i++) {
            for (int j = 1; j <= l; j++) {
                if (p.charAt(j - 1) == '*'){
                    dp[i][j] = dp[i][j - 1];
                    if (i > 0)
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                }
                if (match(i, j))
                    dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[h][l];
    }

    public boolean match(int i, int j){
        if (i == 0)
            return false;
        if (p.charAt(j - 1) == '?')
            return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
