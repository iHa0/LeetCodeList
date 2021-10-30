class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] f = new boolean[s.length() + 1][p.length() + 1];
        f[0][0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '*'){
                    f[i][j] = f[i][j - 2];
                    if (match(s, p, i, j - 1)){
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                }else {
                    if (match(s, p, i, j)){
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }

        return f[s.length()][p.length()];
    }

    public boolean match(String ss, String pp, int l, int r){
        if (l == 0)
            return false;
        if (pp.charAt(r - 1) == '.')
            return true;
        return ss.charAt(l - 1) == pp.charAt(r - 1);
    }
}
