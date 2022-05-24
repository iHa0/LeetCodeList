class Solution {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k--;
        while (k > 0) {
            int node = getNode(cur, n);
            if (k >= node) {
                k -= node;
                cur++;
            } else {
                k--;
                cur *= 10;
            }
        }
        return (int)cur;
    }

    private int getNode(long cur, int n) {
        long next = cur + 1;
        int count = 0;
        while (cur <= n) {
            count += Math.min(n - cur + 1, next - cur);
            cur *= 10;
            next *= 10;
        }
        return count;
    }
}
