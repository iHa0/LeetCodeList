class Solution {
    public double[] dicesProbability(int n) {
        double[] pre = new double[6];
        Arrays.fill(pre, 1.0 / 6.0);
        for (int i = 2; i <= n; i++) {
            double[] temp = new double[5 * i + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += pre[j] / 6.0;
                }
            }
            pre = temp;
        }
        return pre;
    }
}
