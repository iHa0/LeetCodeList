public class LeetCode45 {
    public int jump(int[] nums) {
        int end = 0, maxPosition = 0, steps = 0, len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if (i == end){
                end = maxPosition;
                steps ++;
            }
        }
        return steps;
    }
}
