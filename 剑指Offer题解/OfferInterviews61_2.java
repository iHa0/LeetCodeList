class Solution {
    public boolean isStraight(int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int a : nums) {
            if (a == 0) continue;
            if (a < min) min = a;
            if (a > max) max = a;
            if (set.contains(a)) return false;
            set.add(a);
        }
        return (max - min) < 5; 
    }
}
