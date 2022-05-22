class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
        int left = 0, right = Integer.MAX_VALUE;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(sweetness, k + 1, mid)) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private boolean check(int[] sweetness, int k, int tar) {
        int count = 0, sum = 0;
        for (int a : sweetness) {
            sum += a;
            if (sum > tar) {
                sum = 0;
                count++;
            }
        }
        return count >= k;
    }
}
