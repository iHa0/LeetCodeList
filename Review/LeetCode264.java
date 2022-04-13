class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        for (int i2 = 1, i3 = 1, i5 = 1, index = 2; index <= n; index++) {
            int a = res[i2] * 2, b = res[i3] * 3, c = res[i5] * 5;
            int min = Math.min(a, Math.min(b, c));
            if (min == a) i2++;
            if (min == b) i3++;
            if (min == c) i5++;
            res[index] = min;
        }
        return res[n];
    }
}
