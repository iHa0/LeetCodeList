class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int a : nums) set.add(a);
        int ans = 0;
        for (int a : set) {
            if (!set.contains(a - 1)){
                int cur = a, count = 0;
                while (set.contains(cur++)) count++;
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
