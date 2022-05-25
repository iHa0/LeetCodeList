class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0, len = nums.length;
        for (int a : nums) {
            if (a != 0) nums[index++] = a;
        }
        while (index < len) {
            nums[index++] = 0;
        }
    }
}
