package TopInterview;

import java.util.ArrayList;

public class TopInterview251 {
    int size = 0, index = 0;
    ArrayList<Integer> arrayList = new ArrayList<>();
    public TopInterview251(int[][] vec) {
        for (int[] a : vec) {
            for (int b : a) {
                arrayList.add(b);
                size++;
            }
        }
    }

    public int next() {
        return arrayList.get(index++);
    }

    public boolean hasNext() {
        return index < size;
    }
}
