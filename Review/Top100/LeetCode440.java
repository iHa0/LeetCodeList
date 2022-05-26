class Solution {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k--;
        while (k > 0) {
            int nodes = getNodes(cur, n);
            if (nodes > k) {
                cur *= 10;
                k--;
            } else {
                cur++;
                k -= nodes;
            }
        }
        return (int)cur;
    }

    private int getNodes(long cur, int n) {
        long next = cur + 1, count = 0;
        while (cur <= n) {
            count += Math.min(next - cur, n - cur + 1);
            cur *= 10;
            next *= 10;
        }
        return (int)count;
    }
}
