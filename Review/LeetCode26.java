class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length, res = 1;
        if (len == 1) return 1;
        int left = 0, right = 0;
        while (right < len) {
            while (right < len && nums[left] == nums[right]) right++;   
            if (right < len) {
                nums[++left] = nums[right];
                res++;
            }
        }
        return res;
    }
}
