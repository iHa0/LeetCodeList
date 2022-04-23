class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int res = 0, index = 0, flag = 1;
        while (index < len && s.charAt(index) == ' ') index++;
        if (index >= len) return 0;
        if (s.charAt(index) == '-') flag = -1;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') index++;
        while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int r = s.charAt(index) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res ==Integer.MAX_VALUE / 10 && r > 7)) return flag > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + r;
            index++;
        }
        return flag * res;
    }
}
