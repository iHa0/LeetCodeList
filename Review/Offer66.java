class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int[] res = new int[len];
        Arrays.fill(res, 1);
        int temp = 1;
        for (int i = 1; i < len; i++) {
            temp *= a[i - 1];
            res[i] *= temp;
        }
        temp = 1;
        for (int i = len - 2; i >= 0; i--) {
            temp *= a[i + 1];
            res[i] *= temp;
        }
        return res;
    }
}
