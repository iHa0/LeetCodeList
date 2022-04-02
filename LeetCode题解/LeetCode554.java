class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int len = wall.size();
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int a : wall.get(i)) {
                sum += a;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
            map.remove(sum);
        }
        for (int a : map.keySet()) {
            res = Math.max(res, map.get(a));
        }
        return len - res;
    }
}
