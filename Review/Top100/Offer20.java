class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        int len = s.length();
        boolean hasNum = false, hasDot = false, hasE = false;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len; i++) {
            char a = chars[i];
            if (a <='9' && a >= '0') {
                hasNum = true;
            } else if (a == '.') {
                if (hasDot || hasE) return false;
                hasDot = true;
            } else if (a == 'E' || a == 'e') {
                if (hasE || !hasNum) return false;
                hasE = true;
                hasNum = false;
            } else if (a == '+' || a == '-') {
                if (i != 0 && chars[i - 1] != 'E' && chars[i - 1] != 'e') return false;
            } else {
                return false;
            }
        }
        return hasNum;
    }
}
