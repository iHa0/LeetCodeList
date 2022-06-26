class Solution {
    public int[] singleNumbers(int[] nums) {
        int x = 0, y = 0, n = 0, m = 1;
        for (int num : nums) n ^= num;
        while ((n & m) == 0) m <<= 1;
        for (int num : nums) {
            if ((num & m) == 0) x ^= num;
            else y ^= num;
        }
        return new int[] {x, y};
    }
}
