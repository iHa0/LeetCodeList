import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top56 {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        if (intervals.length == 0)
            return res.toArray(new int[0][]);
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int i = 0;
        while (i < intervals.length){
            int left = intervals[i][0], right = intervals[i][1];
            while (i < intervals.length && intervals[i][0] <= right){
                right = Math.max(right, intervals[i][1]);
                i++;
            }
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[0][]);
    }
}
