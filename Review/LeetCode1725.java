package Review;

import java.util.HashMap;

public class LeetCode1725 {
    public int countGoodRectangles(int[][] rectangles) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int maxlen = 0;
        for (int[] a : rectangles) {
            int temp = Math.min(a[0], a[1]);
            maxlen = Math.max(maxlen, temp);
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }
        return hashMap.get(maxlen);
    }
}
