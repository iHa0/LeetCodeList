package TopInterview;

import java.util.*;

public class TopInterview218 {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<int[]> ps = new ArrayList<>();
        for (int[] b : buildings) {
            int left = b[0], right = b[1], height = b[2];
            ps.add(new int[]{left, -height});
            ps.add(new int[]{right, height});
        }
        Collections.sort(ps, (o1 ,o2) -> {
            return o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0];
        });
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);
        int maxHeight = 0;
        q.add(maxHeight);
        for (int[] p : ps) {
            int point = p[0], height = p[1];
            if (height < 0){
                q.add(-height);
            } else {
                q.remove(height);
            }
            int cur = q.peek();
            if (maxHeight != cur){
                List<Integer> list = new ArrayList<>();
                list.add(point);
                list.add(cur);
                res.add(list);
                maxHeight = cur;
            }
        }
        return res;
    }
}
