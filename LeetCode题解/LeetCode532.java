class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int ans = 0;
        for (int i : nums) {
            if (map.get(i) == 0) continue;
            if (k == 0) {
                if (map.get(i) > 1) ans++;
            } else {
                int a = i - k, b = i + k;
                if (map.getOrDefault(a, 0) > 0) ans++;
                if (map.getOrDefault(b, 0) > 0) ans++;
            }
            map.put(i, 0);
        }
        return ans;
    }
}
