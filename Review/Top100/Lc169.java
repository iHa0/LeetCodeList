class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 0, index = 0;
        for (int i = 0; i < len; i++) {
            if (count == 0) index = nums[i];
            if (nums[i] == index) count ++;
            else count--;
        }
        return index;
    }
}
