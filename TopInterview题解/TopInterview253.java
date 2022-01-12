package TopInterview;

import java.util.Arrays;

public class TopInterview253 {
    public int minMeetingRooms(int[][] intervals) {
        int h = intervals.length;
        int[][] inter = new int[h * 2][2];
        for (int i = 0; i < h; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            inter[i * 2][0] = a;
            inter[i * 2][1] = 1;
            inter[i * 2 + 1][0] = b;
            inter[i * 2 + 1][1] = -1;
        }
        Arrays.sort(inter, (o1, o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });
        int max = Integer.MIN_VALUE, count = 0;
        for (int i = 0; i < 2 * h; i++) {
            count += inter[i][1];
            max = Math.max(max, count);
        }
        return max;
    }
}
