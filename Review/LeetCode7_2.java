class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int cur = x % 10;
            if (res > Integer.MAX_VALUE / 10  || (res == Integer.MAX_VALUE / 10 && cur > 7)) return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && cur < -8)) return 0;
            res = res * 10 + cur;
            x /= 10;
        }
        return res;
    }
}
