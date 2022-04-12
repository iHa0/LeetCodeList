class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        for (int idx = 2, i2 = 1, i3 = 1, i5 = 1; idx <= n; idx++) {
            int a = res[i2] * 2, b = res[i3] * 3, c = res[i5] * 5;
            int min = Math.min(a, Math.min(b, c));
            if (a == min) i2++;
            if (b == min) i3++;
            if (c == min) i5++;
            res[idx] = min;
        }
        return res[n];
    }
}
