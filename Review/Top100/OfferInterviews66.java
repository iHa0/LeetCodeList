class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int[] b = new int[len];
        Arrays.fill(b, 1);
        int temp = 1;
        for (int i = 1; i < len; i++) {
            temp *= a[i - 1];
            b[i] *= temp;
        }
        temp = 1;
        for (int i = len - 2; i >= 0; i--) {
            temp *= a[i + 1];
            b[i] *= temp;
        }
        return b;
    }
}
