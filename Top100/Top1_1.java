class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                int[] res = new int[]{hashMap.get(target - nums[i]), i};
                return res;
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }
}
