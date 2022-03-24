class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int cur = Math.abs(nums[i]);
            nums[cur - 1] = - Math.abs(nums[cur - 1]);
        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
}
