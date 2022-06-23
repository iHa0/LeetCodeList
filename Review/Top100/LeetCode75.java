class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length, n0 = 0, n1 = 0;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            nums[i] = 2;
            if (num < 2) nums[n1++] = 1;
            if (num < 1) nums[n0++] = 0;
        }
    }
}
