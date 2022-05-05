class Solution {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int res = Integer.MIN_VALUE;
        int sum = 1;
        for (int num : nums) {
            sum *= num;
            res = Math.max(res, sum);
            if (num == 0) sum = 1;
        }
        sum = 1;
        for (int i = len - 1; i >= 0; i--) {
            sum *= nums[i];
            res = Math.max(res, sum);
            if (nums[i] == 0) sum = 1;
        }
        return res;
    }
}
