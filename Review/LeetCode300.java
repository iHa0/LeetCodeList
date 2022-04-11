class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] tails = new int[len];
        int res = 0;
        for (int num : nums) {
            int left = 0, right = res;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) left = mid + 1;
                else right = mid;
            }
            tails[left] = num;
            if (right == res) res++;
        }
        return res;
    }
}
