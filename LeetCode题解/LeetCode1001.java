package Review;

import java.util.HashMap;
import java.util.HashSet;

public class LeetCode1001 {
    int[][] dirs = new int[][]{{0,0},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1},{1,0},{1,-1},{1,1}};
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        final long N = n;
        HashMap<Integer, Integer> row = new HashMap<>(), col = new HashMap<>(), left = new HashMap<>(),
                right = new HashMap<>();
        HashSet<Long> hashSet = new HashSet<>();
        for (int[] l : lamps) {
            int x = l[0], y = l[1];
            int a = x + y, b = x - y;
            if (hashSet.contains(x * N + y)) continue;
            row.put(x, row.getOrDefault(x, 0) + 1);
            col.put(y, col.getOrDefault(y, 0) + 1);
            left.put(a, left.getOrDefault(a, 0) + 1);
            right.put(b, right.getOrDefault(b, 0) + 1);
            hashSet.add(x * N + y);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int x = q[0], y = q[1];
            int a = x + y, b = x - y;
            if (row.containsKey(x) || col.containsKey(y) || left.containsKey(a) || right.containsKey(b))
                res[i] = 1;
            for (int[] d : dirs) {
                int newx = x + d[0], newy = y + d[1];
                int newa = newx + newy, newb = newx - newy;
                if (newx < 0 || newy < 0 || newx >= n || newy >= n) continue;
                if (hashSet.contains(newx * N + newy)){
                    hashSet.remove(newx * N + newy);
                    dec(row, newx);
                    dec(col, newy);
                    dec(left, newa);
                    dec(right, newb);
                }
            }
        }
        return res;
    }

    public void dec(HashMap<Integer, Integer> hashMap, int key){
        if (hashMap.get(key) == 1)
            hashMap.remove(key);
        else
            hashMap.put(key, hashMap.get(key) - 1);
    }
}
