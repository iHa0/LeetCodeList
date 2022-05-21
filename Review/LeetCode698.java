class Solution {
    int[] nums;
    int len, target;
    boolean[] used;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        this.nums = nums;
        this.len = nums.length;
        this.used = new boolean[len];
        int sum = 0;
        for (int a : nums) sum += a;
        if (sum % k != 0) return false;
        this.target = sum / k;
        return back(len - 1, 0, k);
    }

    private boolean back(int begin, int curSum, int k) {
        if (k == 1) return true;
        if (curSum == target) return back(len - 1, 0, --k);
        for (int i = begin - 1; i >= 0; i--) {
            if (used[i]) continue;
            if (curSum + nums[i] > target) continue;
            used[i] = true;
            if (back(i, curSum + nums[i], k)) return true;
            used[i] = false;
            while (i > 0 && nums[i] == nums[i - 1]) i--;
        }
        return false;
    }
}
