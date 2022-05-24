class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
        int len = sweetness.length;
        int left = 1, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(sweetness, k + 1, mid)) left = mid + 1;
            else right = mid;
        }
        return left - 1;
    }

    private boolean check(int[] sweetness, int k, int mid) {
        int sum = 0, count = 0;
        for (int a : sweetness) {
            sum += a;
            if (sum >= mid) {
                sum = 0;
                count++;
            }
        }
        return count >= k;
    }
}
