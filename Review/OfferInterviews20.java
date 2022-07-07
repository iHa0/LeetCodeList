class Solution {
    public boolean isNumber(String s) {
        char[] ch = s.trim().toCharArray();
        int len = ch.length;
        if (len == 0) return false;
        boolean hasNum = false, hasE = false, hasDot = false;
        for (int i = 0; i < len; i++) {
            char a = ch[i];
            if (a >= '0' && a <= '9') {
                hasNum = true;
            } else if (a == '.') {
                if (hasDot || hasE) return false;
                hasDot = true;
            } else if (a == 'e' || a == 'E') {
                if (hasE || !hasNum) return false;
                hasE = true;
                hasNum = false;
            } else if (a == '+' || a == '-') {
                if (i != 0 && ch[i - 1] != 'E' && ch[i - 1] != 'e') return false;
            } else return false;
        }
        return hasNum;
    }
}
