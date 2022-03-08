import java.util.Arrays;

public class LeetCode253 {
    public int minMeetingRooms(int[][] intervals) {
        int h = intervals.length, l = 2;
        int[][] nums = new int[2 * h][l];
        int index = 0;
        for (int[] a : intervals) {
            nums[index][0] = a[0];
            nums[index++][1] = 1;
            nums[index][0] = a[1];
            nums[index++][1] = -1;
        }
        Arrays.sort(nums, (o1, o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });
        int ans = Integer.MIN_VALUE, sum = 0;
        for (int[] a : nums) {
            sum += a[1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
