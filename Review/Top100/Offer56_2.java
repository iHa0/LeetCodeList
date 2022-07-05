class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0) return -1;
        int[] bitSum = new int[32];
        int res = 0;
        for (int num : nums) {
            int bitMask = 1;
            for (int i = 31; i >= 0; i--) {
                if ((num & bitMask) != 0) bitSum[i]++;
                bitMask <<= 1;
            }
        }
        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res += bitSum[i] % 3;
        }
        return res;
    }
}
