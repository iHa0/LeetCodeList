class Solution {

    int[] nums;
    int len;
    Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.len = nums.length;
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        int[] ans = nums.clone();
        for (int i = 0; i < len; i++) {
            swap(ans, i, random.nextInt(len - i) + i);
        }
        return ans;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
