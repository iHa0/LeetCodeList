class Solution {
    public boolean makesquare(int[] matchsticks) {
        int len = matchsticks.length, sum = 0;
        for (int a : matchsticks) sum += a;
        if (sum == 0 || sum % 4 != 0) return false;
        int target = sum / 4;
        Arrays.sort(matchsticks);
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
        return back(matchsticks, 0, target, new int[4]);
    }

    private boolean back(int[] nums, int index, int target, int[] size) {
        if (index == nums.length) {
            if (size[0] == size[1] && size[1] == size[2] && size[2] == size[3]) return true;
            else return false;
        }
        for (int i = 0; i < size.length; i++) {
            if (size[i] + nums[index] > target) continue;
            size[i] += nums[index];
            if (back(nums, index + 1, target, size)) return true;
            size[i] -= nums[index];
        }
        return false;
    }
}
