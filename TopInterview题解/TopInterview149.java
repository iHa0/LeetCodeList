package TopInterview;

import java.util.HashMap;

public class TopInterview149 {
    public int maxPoints(int[][] points) {
        int h = points.length;
        int l = points[0].length;
        int res = 1;
        HashMap<String, Integer> hashMap;
        for (int i = 0; i < h; i++) {
            hashMap = new HashMap<>();
            int max = 0;
            for (int j = i + 1; j < h; j++) {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                int a = x1 - x2;
                int b = y1 - y2;
                int c = gdc(a, b);
                String s = (a / c) + "_" + (b / c);
                hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
                max = Math.max(max, hashMap.get(s));
            }
            res = Math.max(res, max + 1);
        }
        return res;
    }
    public int gdc(int a, int b){
        return b == 0 ? a : gdc(b, a % b);
    }
}
