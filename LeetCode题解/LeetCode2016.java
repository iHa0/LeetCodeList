public class LeetCode2016 {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE, max = -1;
        for (int a : nums) {
            min = Math.min(min, a);
            if (a > min)
                max = Math.max(a - min, max);
        }
        return max;
    }
}
