import java.util.HashMap;

public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                res[0] = hashMap.get(temp);
                res[1] = i;
                return res;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return res;
    }
}
