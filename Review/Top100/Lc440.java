class Solution {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k--;
        while (k > 0) {
            int nodes = getNodes(cur, n);
            if (k >= nodes) {
                k -= nodes;
                cur++;
            } else {
                k--;
                cur *= 10;
            }
        }
        return (int) cur;
    }

    private int getNodes(long cur, int n) {
        long next = cur + 1, count = 0;
        while (n >= cur) {
            count += Math.min(next - cur, n - cur + 1);
            next *= 10;
            cur *= 10;
        }
        return (int) count;
    }
}
