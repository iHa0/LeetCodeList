class Solution {
    int len, target;
    int[] nums;
    boolean[] visited;
    public boolean canPartitionKSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        this.nums = nums;
        this.len = nums.length;
        this.visited = new boolean[len];
        int sum = 0;
        for (int a : nums) sum += a;
        if (sum % k != 0) return false;
        this.target = sum / k;
        if (nums[len - 1] > target) return false;
        return back(k, 0, len - 1);
    }

    private boolean back(int k, int curSum, int index) {
        if (k == 1) return true;
        if (curSum == target) return back(k - 1, 0, len - 1);
        for (int i = index; i >= 0; i--) {
            if (visited[i]) continue;
            if (curSum + nums[i] > target) continue;
            visited[i] = true;
            if (back(k, curSum + nums[i], i - 1)) return true;
            visited[i] = false;
            while (i > 0 && nums[i] == nums[i - 1]) i--;
        }
        return false;
    }
}
