package TopInterview;

import java.util.HashMap;

public class TopInterview1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)){
                int[] res = new int[]{hashMap.get(temp), i};
                return res;
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
