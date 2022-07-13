class Solution {
    public int myAtoi(String s) {
        int len = s.length();
        int index = 0, res = 0;
        boolean positive = true;
        while (index < len && s.charAt(index) == ' ') index++;
        if (index >= len) return res;
        if (s.charAt(index) == '-') positive = false;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') index++;
        while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            int cur = s.charAt(index) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && cur > 7)) return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + cur;
            index++;
        }
        return positive ? res : -res;
    }
}
