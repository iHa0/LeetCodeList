class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] tails = new int[len];
        int res = 0;
        for (int num : nums) {
            int i = 0, j = res;
            while (i < j) {
                int m = i + (j - i) / 2;
                if (tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if (res == j) res++;
        }
        return res;
    }
}
