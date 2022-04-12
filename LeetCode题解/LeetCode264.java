class Solution {
    public int nthUglyNumber(int n) {
        int[] nums = new int[]{2,3,5};
        Set<Long> set = new HashSet<>();
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        set.add(1L);
        for (int i = 1; i <= n; i++) {
            long cur = queue.poll();
            if (i == n) return (int)cur;
            for (int num : nums) {
                long t = cur * num;
                if (!set.contains(t)) {
                    set.add(t);
                    queue.add(t);
                }
            }
        }
        return -1;
    }
}
