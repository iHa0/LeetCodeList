class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int len = nums.length, sum = 0;
        for (int a : nums) sum += a;
        if (sum % k != 0) return false;
        int target = sum / k;
        if (len == 1) {
            if (nums[0] == target) return true;
            else return false;
        }
        Arrays.sort(nums);
        if (nums[len - 1] > target) return false;
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return back(nums, 0, target, new int[k]);
    }

    private boolean back(int[] nums, int index, int target, int[] size) {
        if (index == nums.length) {
            boolean allEquals = true;
            for (int i = 1; i < size.length; i++) {
                if (size[i] != size[i - 1]) allEquals = false;
            }
            return allEquals;
        }
        for (int i = 0; i < size.length; i++) {
            if ((size[i] + nums[index] > target) || (i > 0 && size[i] == size[i - 1])) continue;
            size[i] += nums[index];
            if (back(nums, index + 1, target, size)) return true;
            size[i] -= nums[index];
        }
        return false;
    }
}
