class Solution {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k--;
        while (k > 0) {
            int nodes = getNodes(n, cur);
            if (k >= nodes) {
                k -= nodes;
                cur++;
            } else {
                k--;
                cur *= 10;
            }
        }
        return (int)cur;
    }

    private int getNodes(int n, long cur) {
        long next = cur + 1;
        long count = 0;
        while (cur <= n) {
            count += Math.min(n - cur + 1, next - cur);
            next *= 10;
            cur *= 10;
        }
        return (int)count;
    }
}
