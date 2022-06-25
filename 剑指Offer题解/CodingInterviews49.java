class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        int n2 = 1, n3 = 1, n5 = 1;
        for (int index = 2; index <= n; index++) {
            int a = res[n2] * 2, b = res[n3] * 3, c = res[n5] * 5;
            int min = Math.min(a, Math.min(b, c));
            if (a == min) n2++;
            if (b == min) n3++;
            if (c == min) n5++;
            res[index] = min;
        }
        return res[n];
    }
}
