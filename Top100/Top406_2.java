package Top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Top406_2 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1,o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> arrayList = new ArrayList<>();
        for (int[] a:
             people) {
            arrayList.add(a[1], a);
        }
        return arrayList.toArray(new int[arrayList.size()][2]);
    }
}
