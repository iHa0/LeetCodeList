class Solution {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = 14, max = -1;
        for (int a : nums) {
            if (a == 0) continue;
            min = Math.min(min, a);
            max = Math.max(max, a);
            if (set.contains(a)) return false;
            set.add(a);
        }
        return (max - min) < 5;
    }
}
