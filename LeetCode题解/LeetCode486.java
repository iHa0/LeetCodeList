class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return total(nums, 0, nums.length - 1, 1) >= 0;
    }

    private int total(int[] nums, int start, int end, int turn) {
        if (start == end) return nums[start] * turn;
        int scoreStart = nums[start] * turn + total(nums, start + 1, end, -turn);
        int scoreEnd = nums[end] * turn + total(nums, start, end - 1, -turn);
        if (turn == 1) {
            return Math.max(scoreStart, scoreEnd);
        } else {
            return Math.min(scoreStart, scoreEnd);
        }
    }
}
