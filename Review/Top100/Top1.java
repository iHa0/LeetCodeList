package Review.Top100;

import java.util.HashMap;

public class Top1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = nums.length;
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)){
                res[0] = hashMap.get(temp);
                res[1] = i;
                return res;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
