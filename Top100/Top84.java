import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Top84 {
    public int largestRectangleArea(int[] heights) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            int cur = heights[i], max = 0, temp = 0;
            if (hashMap.containsKey(cur))
                continue;
            for (int j = 0; j < heights.length; j++) {
                if (heights[j] >= cur){
                    temp += cur;
                }else {
                    if (temp > max)
                        max = temp;
                    temp = 0;
                }
            }
            if (temp > max)
                max = temp;
            hashMap.put(cur, max);
            max = 0;
            temp = 0;
        }
        Collection<Integer> c = hashMap.values();
        Object[] objects = c.toArray();
        Arrays.sort(objects);
        return (int)objects[objects.length - 1];
    }
}
