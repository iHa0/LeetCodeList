import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CodingInterviews56 {
    
//    方法一
    public int singleNumber1(int[] nums) {
        int len = Arrays.stream(nums).max().getAsInt();
        int[] count = new int[len];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i] - 1]++;
        }
        for (int i = 0; i < len; i++) {
            if (count[i] == 1)
                return i + 1;
        }
        return 0;
    }
    
//    方法二
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++a);
        }
        for (Integer n :
                map.keySet()) {
            if (map.get(n) == 1)
                return n;
        }
        return -1;
    }
}
