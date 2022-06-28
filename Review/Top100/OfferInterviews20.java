class Solution {
    public boolean isNumber(String s) {
        boolean hasNum = false, hasE = false, hasDot = false;
        s = s.trim();
        int len = s.length();
        if (len == 0) return false;
        for (int i = 0; i < len; i++) {
            int a = s.charAt(i);
            if (a <= '9' && a >= '0') {
                hasNum = true;
            } else if (a == '.') {
                if (hasDot || hasE) return false;
                hasDot = true;
            } else if (a == 'E' || a == 'e') {
                if (hasE || !hasNum) return false;
                hasE = true;
                hasNum = false;
            } else if (a == '+' || a == '-') {
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') return false;
            } else {
                return false;
            }
        }
        return hasNum;
    }
}
