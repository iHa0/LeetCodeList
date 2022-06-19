class Solution {
    public boolean isNumber(String s) {
        int len = s.length();
        if (len == 0) return false;
        boolean hasNum = false, hasE = false, hasDot = false;
        char[] ch = s.trim().toCharArray();
        len = ch.length;
        for (int i = 0; i < len; i++) {
            char a = ch[i];
            if (a >= '0' && a <= '9') hasNum = true;
            else if (a == '.') {
                if (hasE || hasDot) return false;
                hasDot = true;
            } else if (a == 'e' || a == 'E') {
                if (!hasNum || hasE) return false;
                hasE = true;
                hasNum = false;
            } else if (a == '-' || a == '+') {
                if (i != 0 && ch[i - 1] != 'e' && ch[i - 1] != 'E') return false;
            } else {
                return false;
            }
        }
        return hasNum;
    }
}
