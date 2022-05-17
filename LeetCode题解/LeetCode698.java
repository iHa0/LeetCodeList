class Solution {
    int[] nums;
    int target;
    boolean[] used;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int len = nums.length, sum = 0;
        Arrays.sort(nums);
        for (int a : nums) sum += a;
        if (sum % k != 0) return false;
        this.target = sum / k;
        this.used = new boolean[len];
        this.nums = nums;
        if (nums[len - 1] > target) return false;
        return back(len - 1, 0, k);
    }

    private boolean back(int begin, int curSum, int k) {
        if (k == 1) return true;
        if (curSum == target) {
            return back(nums.length - 1, 0, --k);
        }
        for (int i = begin; i >= 0; i--) {
            if (used[i]) continue;
            if (curSum + nums[i] > target) continue;
            used[i] = true;
            if (back(i - 1, curSum + nums[i], k)) return true;
            used[i] = false;
            while (i > 0 && nums[i - 1] == nums[i]) i--;
        }
        return false;
    }
}
