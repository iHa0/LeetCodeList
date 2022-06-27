class Solution {
    public int strToInt(String str) {
        int len = str.length();
        int index = 0;
        boolean positive = true;
        int res = 0;
        while (index < len && str.charAt(index) == ' ') index++;
        if (index >= len) return 0;
        if (str.charAt(index) == '-') positive = false;
        if (str.charAt(index) == '-' || str.charAt(index) == '+') index++;
        while (index < len && str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            int cur = str.charAt(index) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && cur > 7)) return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            res = res * 10 + cur;
            index++;
        }
        return positive ? res : -res;
    }
}
