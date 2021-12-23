package TopInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class TopInterview56 {
    public int[][] merge(int[][] intervals) {
        int h = intervals.length;
        ArrayList<int[]> arrayList = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        arrayList.add(intervals[0]);
        int index = 0;
        for (int i = 1; i < h; i++) {
            int a = intervals[i][0], b = intervals[i][1];
            int preb = arrayList.get(index)[1];
            if (a <= preb){
                arrayList.get(index)[1] = Math.max(b, preb);
            }else {
                arrayList.add(intervals[i]);
                index++;
            }
        }
        return arrayList.toArray(new int[arrayList.size()][2]);
    }
}
