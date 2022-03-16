public class LeetCode10 {
    String s, p;
    int h, l;
    boolean[][] dp;
    public boolean isMatch(String s, String p) {
        this.s = s;
        this.p = p;
        this.h = s.length();
        this.l = p.length();
        this.dp = new boolean[h + 1][l + 1];
        dp[0][0] = true;
        for (int i = 0; i < h + 1; i++) {
            for (int j = 1; j < l + 1; j++) {
                if (p.charAt(j - 1) == '*'){
                    dp[i][j] = dp[i][j - 2];
                    if (mach(i, j - 1)){
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    if (mach(i, j))
                        dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[h][l];
    }

    private boolean mach(int i, int j) {
        if (i == 0)
            return false;
        if (p.charAt(j - 1) == '.')
            return true;
        return s.charAt(i - 1) == p.charAt(j - 1);
    }
}
