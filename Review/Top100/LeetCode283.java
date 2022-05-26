class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length, index = 0;
        for (int a : nums) {
            if (a != 0) nums[index++] = a;
        }
        while (index < len) nums[index++] = 0;
    }
}
