class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            int a = nums[i];
            if (map.containsKey(target - a)) {
                res[0] = i;
                res[1] = map.get(target - a);
                return res;
            }
            map.put(a, i);
        }
        return null;
    }
}
