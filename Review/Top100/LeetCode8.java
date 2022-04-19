class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int res = 0, i = 0, flag = 1;
        while (i < len && s.charAt(i) == ' ') i++;
        if (i >= len) return res;
        if (s.charAt(i) == '-') flag = -1;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') i++;
        while (i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int r = s.charAt(i) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && r > 7)) return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + r;
            i++;
        }
        return flag > 0 ? res : -res;
    }
}
