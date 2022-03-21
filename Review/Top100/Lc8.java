class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        boolean flag = false;
        if (s.length() == 0) return 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            if (s.charAt(0) == '-') {
                flag = true;
            }
            s = s.substring(1);
        }
        int len = s.length();
        long res = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                res = res * 10 + (s.charAt(i) - '0');
                if (res > Integer.MAX_VALUE) break;
            } else break;
        }
        if (flag){
            res = -res;
            return (int) Math.max(res, -Math.pow(2, 31));
        }
        return (int) Math.min(res, Math.pow(2, 31) - 1);

    }
}
