class Solution {
    public int reverse(int x) {
        int res = 0, last = 0;
        while (x != 0) {
            int cur = x % 10;
            last = res;
            res = res * 10 + cur;
            if (res / 10 != last) return 0;
            x /= 10;
        }
        return res;
    }
}
